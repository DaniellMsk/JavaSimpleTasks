package com.danila.cycles;

public class Vowel {
    public static void main(String[] args) {
        char button = 'b';

        for (int i = 0; !isVowel(button) ; i++) {
            System.out.println("Буква: " + button);
            button++;
        }

        button = 'b';
        System.out.println("");

        for (int i = 0; !isVowel(button); ) {
            System.out.println("Буква: " + button);
            button++;
            if(isVowel(button) && i == 0){
                button++;
                i++;
            }
        }
    }

    public static boolean isVowel (char button) {
        return button == 'a' || button == 'e' || button == 'y'
                || button == 'i' || button == 'o' || button == 'u';
    }
}
