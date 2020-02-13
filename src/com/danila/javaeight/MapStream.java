package com.danila.javaeight;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class MapStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);
        map.put("Third_______", 3);
        map.put("Forth", 4);
        map.put("Forth______", 4);
        map.put("Fifth", 5);
        map.put("Sixth", 6);

        long sum = map.entrySet().stream()
                .filter(it -> it.getKey().length() > 7)
                .map(Map.Entry::getValue)
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println("Сумма значений с ключами длиннее семи: " + sum);
    }
}
