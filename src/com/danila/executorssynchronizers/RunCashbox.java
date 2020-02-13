package com.danila.executorssynchronizers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class RunCashbox {
    public static void main(String[] args) {
        Semaphore cashboxes = new Semaphore(4);
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 25; i++) {
            executorService.execute(new Buyer(cashboxes, i));
        }

        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
