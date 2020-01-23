package com.danila.setmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountUnique {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 7);

        System.out.println(getIntegers(list).toString());
    }

    public static Set<Integer> getIntegers(List<Integer> list) {
        return new HashSet<>(list);
    }
}
