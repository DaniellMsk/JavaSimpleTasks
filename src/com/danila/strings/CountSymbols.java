package com.danila.strings;

public class CountSymbols {
    public static void main(String[] args) {
        String testString = "fdjkghfjkg//...!!lkfhgljkl,,jk.?/!po!";

        System.out.println(count(testString));
    }

    public static int count (String countString){
        String resultString = countString.replace("!", "")
                .replace(",", "")
                .replace(".", "");
        return countString.length() - resultString.length();
    }
}
