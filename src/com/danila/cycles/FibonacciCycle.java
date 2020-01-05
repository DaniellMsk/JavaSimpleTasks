package com.danila.cycles;

import java.util.Scanner;

public class FibonacciCycle {
    public static void main(String[] args) {
        int fibonacciFirst = 0;
        int fibonacciSecond = 1;
        int fibonacciResult = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предел последовательности чисел Фибоначчи ");
        int limit = scanner.nextInt();

        System.out.printf("Поледовательность Фибоначчи: \n%d\n%d\n", fibonacciFirst, fibonacciSecond);

        while(fibonacciFirst + fibonacciSecond <= limit){
            fibonacciResult = fibonacciFirst + fibonacciSecond;
            fibonacciFirst = fibonacciSecond;
            fibonacciSecond = fibonacciResult;
            System.out.println(fibonacciResult);
        }
    }
}
