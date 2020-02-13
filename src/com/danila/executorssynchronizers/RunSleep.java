package com.danila.executorssynchronizers;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunSleep {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int value = scanner.nextInt();
                if (value == -1) {
                    break;
                }
                executorService.execute(new TasksRunnable(value));
            }
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(1L, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
