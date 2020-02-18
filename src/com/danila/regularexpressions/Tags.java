package com.danila.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tags {
    public static void main(String[] args) {
        String webString = "dsjgfhj <p id=\"34\" > ksdghkdsjhgf </p> fdkjghjfdkg<p id=\"34\" > k3456789sjhgf </p> th <p h = 0 > dlskfjd";
        String regex = "<p(.*?)>(.*?</p>)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(webString);
        StringBuffer stringBuffer = new StringBuffer();

        while (matcher.find()){
            matcher.appendReplacement(stringBuffer, "<p>$2");
        }

        matcher.appendTail(stringBuffer);

        System.out.println(stringBuffer);
    }
}
