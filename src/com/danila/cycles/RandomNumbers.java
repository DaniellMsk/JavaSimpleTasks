package com.danila.cycles;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            System.out.println("Случайное значение: " + randomValue);
            if (maxValue < randomValue){
                maxValue = randomValue;
            }
        }
        System.out.println("Максимальное значение: " + maxValue);
    }
}
