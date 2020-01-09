package com.danila.arrays;

import java.util.Arrays;
import java.util.Random;

public class FourRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numbers = new int[4];
        boolean flag = true;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 10 + random.nextInt(90);
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i-1] >= numbers[i]){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Строго возрастающая последовательность");
        } else {
            System.out.println("Это рандом");
        }
    }
}
