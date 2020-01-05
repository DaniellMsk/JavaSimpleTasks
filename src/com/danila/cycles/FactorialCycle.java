package com.danila.cycles;

import java.util.Scanner;

public class FactorialCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Факториал числа " + number + " равен " + result);
    }
}
