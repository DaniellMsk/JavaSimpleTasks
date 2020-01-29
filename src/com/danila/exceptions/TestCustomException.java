package com.danila.exceptions;

public class TestCustomException {
    public static void main(String[] args) {
        int value = 1;

        try {
            customExceptionThrower(value);
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }

    public static void exceptionThrower(int value) throws RuntimeException {
        throw new IllegalArgumentException();
    }

    public static void  customExceptionThrower(int value) throws CustomException {
        try {
            exceptionThrower(value);
        } catch (IllegalArgumentException e) {
            throw new CustomException(e);
        }
    }
}
