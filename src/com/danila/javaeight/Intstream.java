package com.danila.javaeight;

import java.util.*;

public class Intstream {
    public static void main(String[] args) {
        Double y = (double) 0;

        OptionalDouble average = Arrays.asList(2, 5, 10, 12, 14, 15, 98, 95, 94, 67, 45).stream()
                .filter(it -> it % 5 == 0)
                .mapToInt(Integer::valueOf)
                .average();

        System.out.println("Среднее: " + average);
    }
}
