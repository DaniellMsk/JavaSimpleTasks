package com.danila.generics;

public class JenericsTest {
    public static void main(String[] args) {
        String string = "Первый";
        Integer number = 1;
        Pair<String, Integer> pair = new Pair<>(string, number);
        System.out.println(pair.toString());
        System.out.println(PairUtil.swap(pair));
        System.out.println(PairUtil.getNumberOne(pair));
    }
}
