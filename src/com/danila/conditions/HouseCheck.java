package com.danila.conditions;

import java.util.Scanner;

public class HouseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину первого дома ");
        int a = scanner.nextInt();

        System.out.println("Введите ширину первого дома ");
        int b = scanner.nextInt();

        System.out.println("Введите длину второго дома ");
        int c = scanner.nextInt();

        System.out.println("Введите ширину второго дома ");
        int d = scanner.nextInt();

        System.out.println("Введите длину участка ");
        int e = scanner.nextInt();

        System.out.println("Введите ширину участка");
        int f = scanner.nextInt();

        boolean result = false;

        if ((((a + c <= e) && (b <= f && d <= f)) || ((b + c <= e) && (a <= f && d <= f)) || ((a + d <= e) && (b <= f && c <= f))
                || ((b + d <= e) && (a <= f && c <= f))) || (((a + c <= f) && (b <= e && d <= e)) || ((b + c <= f) && (a <= e && d <= e)) ||
                ((a + d <= f) && (b <= e && c <= e)) || ((b + d <= f) && (a <= e && c <= e)))){
            result = true;
        }

        if (result){
            System.out.println("Дома умещаются");
        } else  {
            System.out.println("Дома не умещаются");
        }


    }
}
