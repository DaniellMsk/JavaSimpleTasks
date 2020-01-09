package com.danila.arrays;

import java.util.Arrays;

public class ThirteenSeventeen {
    public static void main(String[] args) {
        int [] numbers = new int [100];

        for (int i = 0, count = 13; i < numbers.length;) {
            if((count % 13 == 0) || (count % 17 == 0)){
                numbers[i] = count;
                count++;
                i++;
            }
            count++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
