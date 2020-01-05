package com.danila.cycles;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int fibonacciResult = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предел последовательности чисел Фибоначчи ");
        int limit = scanner.nextInt();

        for (int i = 1; fibonacciResult <= limit; i++) {
            System.out.println("Число Фибоначчи: " + fibonacciResult );
            fibonacciResult =  fibonacci(i);
        }
    }

    public static int fibonacci(int fibonacciResult){
            if (fibonacciResult == 0){
                return 0;
            }
            if (fibonacciResult == 1){
                return 1;
            }
            else {
                return fibonacci(fibonacciResult-1)+fibonacci(fibonacciResult-2);
            }
    }
}
