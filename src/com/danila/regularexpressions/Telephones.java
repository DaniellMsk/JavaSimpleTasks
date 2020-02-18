package com.danila.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telephones {
    public static void main(String[] args) {
        String stringWithNumbers = "jkdfghkdfjg +7 (916) 345-3456 kdjfhgfdkuhg 8 903 3458645 lkhjglj";
        String regex = "(\\+7|8).*?(916|926|903|905|928).*?(\\d{3}).*?(\\d{2}).*?(\\d{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringWithNumbers);

        StringBuffer stringBuffer = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "+7($2)$3-$4-$5");
        }

        matcher.appendTail(stringBuffer);

        matcher = pattern.matcher(stringBuffer);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
