package com.danila.strings;

import java.util.Random;

public class StringsSum {
    public static void main(String[] args) {
        Random random = new Random();
        String result = "";
        int iters = 100_000;
        long startTime;
        long endTime;

        startTime = System.nanoTime();

        for (int i = 0; i < iters; i++) {
            result += random.nextInt(100);
        }

        endTime = System.nanoTime();

        System.out.println(result);
        System.out.println("Время выполнения: " + (endTime - startTime));

        StringBuilder stringBuilder = new StringBuilder();

        startTime = System.nanoTime();

        for (int i = 0; i < iters; i++) {
            stringBuilder.append(random.nextInt(100));
        }
        result = stringBuilder.toString();

        endTime = System.nanoTime();

        System.out.println(result);
        System.out.println("Время выполнения: " + (endTime - startTime));
    }
}
