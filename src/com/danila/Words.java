package com.danila;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово: ");
        String firstWord = scanner.nextLine();

        System.out.println("Введите второе слово: ");
        String secondWord = scanner.nextLine();

        if(firstWord.equals(secondWord)){
            System.out.println("Слова одинаковы");
        }

        else if (firstWord.equalsIgnoreCase(secondWord)){
            System.out.println("Слова почти одинаковы");
        }

        else if (firstWord.length() > secondWord.length()){
            System.out.println("Первое слово длиннее второго");
        } else if (firstWord.length() == secondWord.length()) {
            System.out.println("Слова одинаковой длины");
        } else
            System.out.println("Первое слово короче второго");
    }
}
