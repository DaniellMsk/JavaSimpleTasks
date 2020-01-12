package com.danila.strings;

import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        String [] stringArray1 = {"first", "second", "third"};
        String [] stringArray2 = {"first", "third", "second"};

        System.out.println(isEqualsArray(stringArray1, stringArray2));
    }

    public static boolean isEqualsArray(String [] stringArray1, String [] stringArray2){
        boolean result = true;

        if(stringArray1.length != stringArray2.length) {
            result = false;
        }

        Arrays.sort(stringArray1);
        Arrays.sort(stringArray2);

        for (int i = 0; i < stringArray1.length; i++) {
            if (!stringArray1[i].equals(stringArray2[i])){
                result = false;
                break;
            }
        }
        return result;
    }
}
