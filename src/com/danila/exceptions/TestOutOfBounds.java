package com.danila.exceptions;

public class TestOutOfBounds {
    public static void main(String[] args) {
        int [] testArray = new int [3];

        try {
            testArray[3] = 5;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
