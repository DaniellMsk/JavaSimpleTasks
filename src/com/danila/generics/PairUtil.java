package com.danila.generics;

public class PairUtil {
    private PairUtil() {
    }

    public static <K, V> String swap(Pair<K, V> pair){
        return new Pair<V, K>(pair.getSecondValue(), pair.getFirstValue()).toString();
    }

    public static String getNumberOne(Pair<?, ?> number){
        return number.getFirstValue().toString() + " номер это я!";
    }
}
