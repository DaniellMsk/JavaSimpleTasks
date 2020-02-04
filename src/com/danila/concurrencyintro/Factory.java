package com.danila.concurrencyintro;

import java.util.*;

public class Factory implements Runnable {
    private final ArrayList<Details> dump = new ArrayList<>();
    private static final Details[] details;

    static {
        details = Details.values();
    }

    @Override
    public void run() {
        int nights = 100;
        while (nights != 0) {
            synchronized (dump) {
                for (int i = 0; i < RandomUtil.getRandom(4) + 1; i++) {
                    dump.add(details[RandomUtil.getRandom(9)]);
                }
                try {
                    dump.wait(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            nights--;
        }
    }

    public ArrayList<Details> getDump() {
        synchronized (dump) {
            return dump;
        }
    }
}
