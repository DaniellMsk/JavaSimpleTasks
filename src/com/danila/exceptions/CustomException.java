package com.danila.exceptions;

public class CustomException extends RuntimeException {
    CustomException(String message) {
        System.out.println(message);
    }

    CustomException(Throwable e) {
        super();
    }
}
