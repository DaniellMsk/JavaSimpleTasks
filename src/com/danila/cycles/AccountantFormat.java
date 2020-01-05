package com.danila.cycles;

import java.util.Scanner;

public class AccountantFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        String result = "";

        while(number > 0){
            for (int i = 1; i <= 3 && number > 0; i++) {
                result = (number % 10) + result;
                number /= 10;
            }
            result = " " + result;
        }
        System.out.println("Полученное число: " + result.trim());
    }
}
