package com.danila.conditions;

import java.util.Scanner;

public class Rubles {
    public static void main(String[] args) {
        System.out.print("Веведите количество рублей: ");

        Scanner scanner = new Scanner(System.in);
        int rubles = scanner.nextInt();
        boolean flag = false;

        if((11 <= rubles % 100 && rubles % 100 <= 19) || rubles % 10 >= 5 || rubles % 10 == 0){
            System.out.println(rubles + " рублей");
            flag = true;
        }

        if(2 <= rubles % 10 && rubles % 10 <= 4 && !flag){
            System.out.println(rubles + " рубля");
        }

        if (rubles % 10 == 1 && !flag){
            System.out.println(rubles + " рубль");
        }
    }
}
