package com.danila.conditions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day, month, year;

        System.out.println("Введите число");
        day = scanner.nextInt();

        System.out.println("Введите месяц");
        month = scanner.nextInt();

        System.out.println("Введите год");
        year = scanner.nextInt();

        if(isValidDate(day, month, year)){
            System.out.println("Дата корректна");
        } else {
            System.out.println("Дата некорректна");
        }

    }



    public static boolean isLeap(int year){
        boolean result = false;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            result = true;
        }
        return result;
    }

    public static boolean isValidDate(int day, int month, int year){
        boolean result = false;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (1 <= day && day <= 31) {
                    result = true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (1 <= day && day <= 30) {
                    result = true;
                }
                break;
            case 2:
                if (isLeap(year)) {
                    if (1 <= day && day <= 29) {
                        result = true;
                    }
                } else if (1 <= day && day <= 28) {
                    result = true;
                }
                break;
            default:
                System.out.println("Некорректные данные");
        }
        return result;
    }
}

