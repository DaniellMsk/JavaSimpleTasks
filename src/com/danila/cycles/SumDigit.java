package com.danila.cycles;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0){
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Сумма цифр: " + sum);
    }
}
