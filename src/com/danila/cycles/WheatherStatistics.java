package com.danila.cycles;

import java.util.Scanner;

public class WheatherStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число дней: ");
        int days = scanner.nextInt();
        int precipitationSum = 0;
        int precipitationAverage = 0;
        int precipitationMax = 0;

        for (int i = 1; days >= i; i++) {
            System.out.println("Введите количество осадков за день: ");
            int precipitation = scanner.nextInt();
            precipitationSum += precipitation;
            if (precipitationMax < precipitation){
                precipitationMax = precipitation;
            }
        }
        precipitationAverage = precipitationSum / days;

        System.out.printf("\nКоличество дней: %d\nСумма осадков: %d\nСреднее количество осадков: %d\n" +
                "Максимальное количество осадков за день: %d\n", days, precipitationSum, precipitationAverage,
                precipitationMax);
    }
}
