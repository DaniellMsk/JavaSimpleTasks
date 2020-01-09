package com.danila.arrays;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(shift(numbers)));
    }

    public static int[] shift(int[] numbers) {
        int temp1 = numbers[0];;
        int temp2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                temp2 = numbers[i + 1];
                numbers[i + 1] = temp1;
                temp1 = temp2;
            } else {
                numbers[0] = temp2;
            }
        }
        return numbers;
    }
}
