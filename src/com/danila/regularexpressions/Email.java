package com.danila.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String email = "ba2n_ana@gmail.com";
        String regex = "^([a-z]|[A-Z])\\w*@([a-z]|[A-Z])\\w*\\.(com|org)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        System.out.println(matcher.matches());
    }
}
