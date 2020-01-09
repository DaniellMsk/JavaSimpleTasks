package com.danila.arrays;

import java.util.Arrays;

public class RepetitiveNumbers {
    public static void main(String[] args) {
        int [] numbers = new int [] {1, 4, 4, 5, 4, 5, 6, 4, 8, 8, 8, 10, 11, 11};
        int [] newNumbers;
        int length = numbers.length;
        boolean flag = true;
        boolean flag2 = true;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                        length--;
                        break;
                    }
                }
            }
        newNumbers = new int [length];

        for (int i = 0, k = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] == numbers[j] && i != j){
                    flag = false;
                    break;
                }
            }

            if(flag) {
                newNumbers[k] = numbers[i];
                k++;
            } else {
                for (int j = 0; j < newNumbers.length; j++) {
                    if (numbers[i] == newNumbers[j]){
                        flag2 = false;
                        break;
                    }
                }
                if(flag2) {
                    newNumbers[k] = numbers[i];
                    k++;
                }
            }
            flag = true;
            flag2 = true;
        }

        System.out.println(Arrays.toString(newNumbers));
    }
}
