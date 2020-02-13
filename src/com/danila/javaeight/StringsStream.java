package com.danila.javaeight;

import java.util.Arrays;
import java.util.List;

public class StringsStream {
    public static void main(String[] args) {
        long strings = Arrays.asList("sdfdf", "hdfhgd", "1", "111111111", "ooooooooooooo", "111111111").stream()
                .filter(it -> it.length() > 8)
                .distinct()
                .count();

        System.out.println("Количество уникальных строк больше восьми: " + strings);
    }
}
