package com.danila.executorssynchronizers;

import java.util.concurrent.*;

public class ParallelSearch {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        int [] values = new int [1_000_000];

        for (int i = 0; i < values.length; i++) {
            values[i] = RandomUtil.getRandom(300);
        }

        int max = 0;

        long startTime = System.nanoTime();

        for (int i = 0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Время выполнения в одном потоке: " + (endTime - startTime));
        System.out.println("Максимальное значение: " + max);

        max = 0;

        startTime = System.nanoTime();

        for (int i = 0; i < 10; i++) {
            Future <Integer> maxFinder;
            maxFinder = executorService.submit(new Finder(values, i));
            try {
                if (max < maxFinder.get()) {
                    max = maxFinder.get();
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        endTime = System.nanoTime();
        System.out.println("Время выполнения в 10 потоках: " + (endTime - startTime));
        System.out.println("Максимальное значение: " + max);

        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
