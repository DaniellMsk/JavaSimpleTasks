package com.danila.arrays;

public class ArrayWriter {
    public static void main(String[] args) {
        int [] array = {1,3,5,7,9};

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
