package com.danila.strings;

public class StartAndEnd {
    public static void main(String[] args) {
        String testString = "aaakdjfhgdklfhgklsdjflkdhaaa";
        String testWord = "aaa";

        System.out.println(isStartingandEnding(testString, testWord));
    }

    public static boolean isStartingandEnding(String checkString, String checkWord) {
        return checkString.startsWith(checkWord) && checkString.endsWith(checkWord);
    }
}
