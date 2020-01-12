package com.danila.strings;

public class Palindrome {
    public static void main(String[] args) {
        String testString = "Асоса асса асса ";

        System.out.println(isPalindrome(testString));
    }

    public static boolean isPalindrome(String stringForCheck){
        String revertedString = "";
        StringBuilder stringBuilder = new StringBuilder();

        stringForCheck = stringForCheck.trim();

        for (int i = 0; i < stringForCheck.length(); i++) {
            stringBuilder.append(stringForCheck.charAt((stringForCheck.length() - 1) - i));
        }

        revertedString = stringBuilder.toString();

        return stringForCheck.equalsIgnoreCase(revertedString);
    }
}
