package com.danila.executorssynchronizers;

import java.util.concurrent.Semaphore;

public class Buyer implements Runnable {
    private Semaphore semaphore;
    private int number;

    public Buyer(Semaphore semaphore, int number){
        this.semaphore = semaphore;
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Покупатель " + number + " обслуживается в кассе");
        try {
            semaphore.acquire();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        System.out.println("Покупатель " + number + " закончил обслуживаться в кассе");
    }
}
