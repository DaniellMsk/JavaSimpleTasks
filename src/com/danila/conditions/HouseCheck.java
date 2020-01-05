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

        if ((a+c <= e || a+d <= e || b+c <= e || b+d <= e) && (a+c <= f || a+d <= f || b+c <= f || b+d <= f)){
            result = true;
        }

        if (result){
            System.out.println("Дома умещаются");
        } else  {
            System.out.println("Дома не умещаются");
        }


    }
}
