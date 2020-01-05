package com.danila.cycles;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число для проверки ");
        int number = scanner.nextInt();

        if (isSimple(number)){
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
    }

    public static boolean isSimple(int number){
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
