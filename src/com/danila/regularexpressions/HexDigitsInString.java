package com.danila.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexDigitsInString {
    public static void main(String[] args) {
        String hexDigits = "dfgdfhdfg 0x123456 jhfvhyjgbj 0XAB547 kjhkj";
        String regex = "0[x|X]([A-F]|[a-f]|[0-9])+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hexDigits);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
