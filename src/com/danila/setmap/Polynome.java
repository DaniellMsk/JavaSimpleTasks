package com.danila.setmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Polynome {
    public static void main(String[] args) {
        Map<Integer, Integer> firstPolynome = new LinkedHashMap<>();
        Map<Integer, Integer> secondPolynome = new LinkedHashMap<>();

        addTestValues(firstPolynome, secondPolynome);

        for (Integer key : secondPolynome.keySet()) {
            firstPolynome.put(key, firstPolynome.get(key) + secondPolynome.get(key));
            System.out.print(key + "x^" + firstPolynome.get(key) + " + ");
        }




    }

    public static void addTestValues(Map<Integer, Integer> firstPolynome, Map<Integer, Integer> secondPolynome) {
        firstPolynome.put(7, 3);
        firstPolynome.put(6, 3);
        firstPolynome.put(5, 4);
        firstPolynome.put(4, 2);
        firstPolynome.put(3, 1);
        firstPolynome.put(2, 7);
        firstPolynome.put(1, 0);
        firstPolynome.put(0, 1);

        secondPolynome.put(7, 3);
        secondPolynome.put(6, 4);
        secondPolynome.put(5, 0);
        secondPolynome.put(4, 4);
        secondPolynome.put(3, 6);
        secondPolynome.put(2, 7);
        secondPolynome.put(1, 0);
        secondPolynome.put(0, 1);
    }
}
