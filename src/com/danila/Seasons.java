package com.danila;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима пришла");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна греет");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето, солнце, море, пляж");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенняя пора");
                break;
            default:
                System.out.println("Введён несуществующий месяц");
        }
    }
}
