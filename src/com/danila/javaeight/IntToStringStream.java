package com.danila.javaeight;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IntToStringStream {
    public static void main(String[] args) {
        String result = Arrays.asList(2, 5, 10, 12, 14, 15, 98, 95, 94, 67, 45).stream()
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println("Итоговая строка: " + result);
    }
}
