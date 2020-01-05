package com.danila.cycles;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Факториал числа " + number + " равен " + factorial(number));
    }

    public static int factorial(int number){
        if(number == 1){
            return 1;
        } else return number * factorial(--number);
    }
}
