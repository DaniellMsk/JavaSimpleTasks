package com.danila.strings;

public class RepetitiveSymbols {
    public static void main(String[] args) {
        String testString = "assssddddddffghhjjkl   ;;;]ddd";

        System.out.println(getString(testString));
    }

    public static String getString(String testString) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < testString.length(); i++) {
            if (i == testString.length() - 1){
                stringBuilder.append(testString.charAt(i));
                break;
            }
            if (testString.charAt(i) != testString.charAt(i + 1)){
                stringBuilder.append(testString.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
