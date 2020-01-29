package com.danila.exceptions;

import java.util.Random;

public class ThreeTypes {
    public static void main(String[] args) {
        try{
            randomException();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void randomException() throws Exception {
        Random random = new Random();
        int randomValue = random.nextInt(3);

        switch (randomValue) {
            case 0:
                throw new IllegalArgumentException();
            case 1:
                throw new IndexOutOfBoundsException();
            case 2:
                throw new NullPointerException();
        }
    }
}
