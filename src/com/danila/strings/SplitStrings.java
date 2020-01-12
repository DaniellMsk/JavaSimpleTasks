package com.danila.strings;


import java.util.Arrays;

public class SplitStrings {
    public static void main(String[] args) {
        String testString = "01234567890123456789";
        int splitedStringLength = 6;

        System.out.println(Arrays.toString(makeArray(testString, splitedStringLength)));
    }

    public static String[] makeArray(String stringToSplit, int amountOfSymbols){
        String [] result = new String [(int) Math.ceil((double)stringToSplit.length()/amountOfSymbols)];

        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                result[i] = stringToSplit.substring(i * amountOfSymbols);
            } else {
                result[i] = stringToSplit.substring(i * amountOfSymbols, i * amountOfSymbols + amountOfSymbols);
            }
        }

        return result;
    }
}
