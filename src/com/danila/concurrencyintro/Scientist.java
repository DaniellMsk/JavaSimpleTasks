package com.danila.concurrencyintro;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Getter
public class Scientist implements Runnable {
    private String scientistName;
    private Set<Details> robot;
    private ArrayList<Details> collectedDetails;
    private boolean nightsOver = false;

    Scientist(String scientistName, Factory factory) {
        this.scientistName = scientistName;
        collectedDetails = new ArrayList<>();
        robot = new HashSet<>();
        Servant servant = new Servant(factory);
        Thread servantWorking = new Thread(servant);
        servantWorking.start();
    }

    @Override
    public void run() {
        while (!nightsOver) {
            if (!collectedDetails.isEmpty()) {
                System.out.println(scientistName + " имеет " + collectedDetails.size() + " деталей");
                for (int i = 0; i < collectedDetails.size(); i++) {
                    if (robot.add(collectedDetails.get(i))) {
                        System.out.println(scientistName + " добавил деталь к своему роботу");
                        collectedDetails.remove(i);
                        System.out.println(scientistName + " имеет " + collectedDetails.size() + " деталей");
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Робот, которого создаёт " + scientistName + " имеет " + robot.size() + " деталей");
            if (robot.size() == 9) {
                new Robot(scientistName);
                robot.clear();
                System.out.println(scientistName + " создал робота");
            }
        }
    }

    public class Servant implements Runnable {
        private final ArrayList<Details> dump;
        private ArrayList<Details> taken;

        Servant(Factory factory) {
            this.dump = factory.getDump();
            this.taken = new ArrayList<>();
        }

        @Override
        public void run() {
            int nights = 100;
            while (nights != 0) {
                System.out.println("Прислужник " + scientistName + " идёт на свалку в ночь номер " + (100 - nights));
                synchronized (dump) {
                    System.out.println("Прислужник " + scientistName + " видит на свалке " + dump.size() + " деталей");
                    if (!dump.isEmpty()) {
                        for (int i = 0; i < RandomUtil.getRandom(4) + 1; i++) {
                            if (dump.isEmpty()) {
                                break;
                            }
                            int randomDetail = RandomUtil.getRandom(dump.size());
                            taken.add(dump.get(randomDetail));
                            dump.remove(randomDetail);
                        }
                        System.out.println("Прислужник " + scientistName + " взял со свалки " + taken.size() + " деталей");
                    }

                    if (!taken.isEmpty()) {
                        collectedDetails.addAll(taken);
                        taken.clear();
                        System.out.println("Прислужник " + scientistName + " отдал детали учёному ");
                    }

                    try {
                        dump.wait(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                nights--;
                System.out.println("Прислужник " + scientistName + " дождался следующей ночи");
            }
            nightsOver = true;
        }
    }
}
