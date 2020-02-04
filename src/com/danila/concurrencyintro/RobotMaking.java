package com.danila.concurrencyintro;

import java.util.Map;

public class RobotMaking {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Scientist vasiliy = new Scientist("Василий", factory);
        Scientist gennadiy = new Scientist("Геннадий", factory);

        Thread factoryWorking = new Thread(factory);

        Thread vasya = new Thread(vasiliy);
        Thread gena = new Thread(gennadiy);

        factoryWorking.start();
        vasya.start();
        gena.start();

        try {
            vasya.join();
            gena.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Map<String, Integer> robots = Robot.getRobotCounter();

        System.out.println("Василий создал роботов: " + robots.get(vasiliy.getScientistName()));
        System.out.println("Геннадий создал роботов: " + robots.get(gennadiy.getScientistName()));
    }
}
