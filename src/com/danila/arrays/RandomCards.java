package com.danila.arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomCards {
    public static void main(String[] args) {
        String [] cards = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String [] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String [] cardsOfSuits = new String[52];
        int k = 0;
        boolean flag = true;

        String [] deckOfCards = Cards.deckBuilder(cards, suits, cardsOfSuits, k);

        Random random = new Random();
        int [] indexes = new int [52];
        String [] randomDeck = new String[52];

        for (int i = 0; i < indexes.length; i++) {
            int randomValue = random.nextInt(52);
            int j = 0;
            for (; j < i; j++) {
                if (randomValue == indexes[j]){
                    i--;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                indexes[i] = randomValue;
                randomDeck[i] = deckOfCards[indexes[i]];
            } else {
                flag = true;
            }
        }
        System.out.println("\nПеретасованная колода: ");
        System.out.println(Arrays.toString(randomDeck).replace(',','\n'));
    }
}
