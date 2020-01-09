package com.danila.arrays;

import java.util.Random;

public class BetweenMinAndMaxSum {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int [5];
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;

        initializeNumbers(random, numbers);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println();

        if (minIndex > maxIndex){
            int temp;
            temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }

        for (int i = minIndex; i <= maxIndex; i++){
            sum += numbers[i];
        }
        System.out.println("Сумма: " + sum);
    }

    public static int[] initializeNumbers(Random random, int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println(numbers[i]);
        }
        return numbers;
    }
}
