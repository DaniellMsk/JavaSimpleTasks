package com.danila.strings;

public class RomanNumbers {
    public static void main(String[] args) {
        String romanNumber = "XCg";

        System.out.print("Результат перевода: " + translateToCommonNumber(romanNumber));
    }

    public static int translateToCommonNumber(String romanNumber) {
        int result = 0;
        int previousAddNumber = Integer.MAX_VALUE;

        for (int i = 0; i < romanNumber.length(); i++) {
            int addNumber = 0;

            switch (romanNumber.charAt(i)) {
                case 'M':
                    addNumber = 1000;
                    break;
                case 'D':
                    addNumber = 500;
                    break;
                case 'C':
                    addNumber = 100;
                    break;
                case 'L':
                    addNumber = 50;
                    break;
                case 'X':
                    addNumber = 10;
                    break;
                case 'V':
                    addNumber = 5;
                    break;
                case 'I':
                    addNumber = 1;
                    break;
                default:
                    System.out.println("Обнаружен неверный символ");
                    break;
            }

            result += addNumber;

            if(previousAddNumber < addNumber) {
                result -= previousAddNumber * 2;
            }

            previousAddNumber = addNumber;
        }

        return result;
    }
}
