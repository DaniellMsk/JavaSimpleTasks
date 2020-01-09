package com.danila.arrays;

import java.util.Arrays;
import java.util.Random;

public class EqualsArrayElements {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] firstArray = new int [5][5];
        int [][] secondArray = new int [5][5];
        char [][] equalsArray = new char [5][5];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = random.nextInt(5);
                secondArray[i][j] = random.nextInt(5);
            }
        }

        for (int[] chars : firstArray) {
            System.out.println(Arrays.toString(chars));
        }

        System.out.println();

        for (int[] chars : secondArray) {
            System.out.println(Arrays.toString(chars));
        }

        System.out.println();

        for (int i = 0; i < equalsArray.length; i++) {
            for (int j = 0; j < equalsArray[i].length; j++) {
                if (isEquals(firstArray[i][j], secondArray[i][j])){
                    equalsArray[i][j] = '+';
                } else {
                    equalsArray[i][j] = '-';
                }
            }
        }

        for (char[] chars : equalsArray) {
            System.out.println(Arrays.toString(chars));
        }
    }

    public static boolean isEquals (int numberOne, int numberTwo) {
        return numberOne == numberTwo;
    }
}
