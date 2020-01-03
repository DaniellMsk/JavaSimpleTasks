package com.danila;

import java.util.Scanner;

public class SmallTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число для сравнения ");
        int firstInteger = scanner.nextInt();

        System.out.println("Введите второе число для сравнения ");
        int secondInteger = scanner.nextInt();

        System.out.println("Введите число для возведения в куб ");
        int integerForPow = scanner.nextInt();

        System.out.println("Введите число для проверки на то, что оно оканчивается на тройку ");
        int integerForThreeChecking = scanner.nextInt();

        System.out.println("Введите символ ");
        String temp = scanner.next();

        System.out.println("Введите число для изменения символа ");
        int symbolChanger = scanner.nextInt();

        char symbol = (char) temp.charAt(0);

        System.out.println("Максимальное число из двух: " + biggerNumber(firstInteger, secondInteger));
        System.out.println("Число в кубе: " + сube(integerForPow));
        System.out.println("Число оканчивается на тройку: " + isLastNumberThree(integerForThreeChecking));
        System.out.println("Новый символ: " + newChar(symbol, symbolChanger));
    }

    public static int biggerNumber (int firstInt, int secondInt){
        return firstInt > secondInt ? firstInt : secondInt;
    }

    public static int сube(int numberForCube){
        return (int) Math.pow(numberForCube, 3);
    }

    public static boolean isLastNumberThree(int numberForThree){
        return numberForThree % 10 == 3;
    }

    public static char newChar (char oldCharacter, int symbolChanger){
        return (char) (oldCharacter + symbolChanger);
    }

}
