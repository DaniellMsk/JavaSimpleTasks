package com.danila.strings;

public class Initials {
    public static void main(String[] args) {
        String name = "Danila";
        String surname = "Ioramashvili";
        String patronmyc = "Amiranovich";

        System.out.println(initialsResult(name, surname, patronmyc));
    }

    public static String initialsResult(String name, String surname, String patronimyc) {
        return (surname.charAt(0)+"."+name.charAt(0)+"."+patronimyc.charAt(0)).toUpperCase();
    }
}
