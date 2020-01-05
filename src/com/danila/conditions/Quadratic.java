package com.danila.conditions;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a ");
        double a = scanner.nextDouble();

        System.out.println("Введите b ");
        double b = scanner.nextDouble();

        System.out.println("Введите c");
        double c = scanner.nextDouble();

        if (isPositive(a, b, c)){
            double firstRoot = ((-b + Math.sqrt(discriminant(a, b, c)))/(2*a));
            double secondRoot = ((-b - Math.sqrt(discriminant(a, b, c)))/(2*a));
            System.out.println("Первый корень: " + firstRoot + "\nВторой корень " + secondRoot);
        } else if (isZero(a, b, c)){
            double Root = -b/(2*a);
            System.out.println("Единственный корень " + Root);
        } else {
            System.out.println("Нет корней");
        }
    }

    public static boolean isPositive(double a, double b, double c){
        return discriminant(a, b, c) > 0;
    }

    public static boolean isZero(double a, double b, double c){
        return discriminant(a, b, c) == 0;
    }

    public static double discriminant(double a, double b, double c){
        return b*b - 4*a*c;
    }
}
