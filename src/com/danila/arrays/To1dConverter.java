package com.danila.arrays;

import java.util.Arrays;

public class To1dConverter {
    public static void main(String[] args) {
        int [][] array = {  {1, 2, 3, 4, 5},
                            {2, 3, 5},
                            {8, 9, 6, 4} };

        System.out.println(Arrays.toString(linearize(array)));
    }

    public static int[] linearize (int [][] array){
        int relultLength = 0;

        for (int i = 0; i < array.length; i++) {
            relultLength += array[i].length;
        }

        int [] resultArray = new int [relultLength];

        for (int i = 0; i < resultArray.length; ) {
            for (int k = 0; k < array.length; k++) {
                for (int j = 0; j < array[k].length; j++) {
                    resultArray[i] = array[k][j];
                    i++;
                }
            }
        }
        return resultArray;
    }
}
