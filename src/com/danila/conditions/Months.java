package com.danila.conditions;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day, month, year;

        System.out.println("Введите число");
        day = scanner.nextInt();

        System.out.println("Введите месяц");
        month = scanner.nextInt();

        System.out.println("Введите год");
        year = scanner.nextInt();

        System.out.println(dateBuilder(day, month, year));
    }

    public static String dateBuilder(int day, int month, int year) {
        if (month > 12) {
            year += month / 12;
            month %= 12;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day >= 31) {
                    day -= 31;
                    month++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day >= 30) {
                    day -= 30;
                    month++;
                }
                break;
            case 2:
                if (isLeap(year)) {
                    if (day >= 29) {
                        day -= 29;
                        month++;
                    }
                } else if (day >= 28) {
                    day -= 28;
                    month++;
                }
                break;
            default:
                System.out.println("Некорректные данные");
        }
    return day + "." + month + "." + year;

    }

    public static boolean isLeap(int year) {
        boolean result = false;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            result = true;
        }
        return result;
    }
}
