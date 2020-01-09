package com.danila.arrays;

import java.util.Arrays;

public class ConcatArrays {
    public static void main(String[] args) {
        int [] array1 = new int []{1, 2, 3, 4, 5};
        int [] array2 = new int []{6, 7, 8};

        int [] relultArray = new int [array1.length + array2.length];

        for (int i = 0; i < relultArray.length; ) {
            for (int j = 0; j < array1.length; j++) {
                relultArray[i] = array1[j];
                i++;
            }
            for (int j = 0; j < array2.length; j++) {
                relultArray[i] = array2[j];
                i++;
            }

            System.out.println(Arrays.toString(relultArray));
        }
    }
}
