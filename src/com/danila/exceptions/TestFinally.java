package com.danila.exceptions;

import java.util.Random;

public class TestFinally {
    public static void main(String[] args) {
        try {
            fiftyPercentException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Финалли!");
        }
    }

    public static void fiftyPercentException() throws IllegalArgumentException {
        Random random = new Random();
        if (random.nextInt(2) > 0) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("Не было исключения!");
        }
    }
}
