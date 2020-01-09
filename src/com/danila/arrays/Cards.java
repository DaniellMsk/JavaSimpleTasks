package com.danila.arrays;

public class Cards {
    public static void main(String[] args) {
        String [] cards = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String [] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String [] cardsOfSuits = new String[52];
        int i = 0;

        deckBuilder(cards, suits, cardsOfSuits, i);
    }

    public static String[] deckBuilder(String[] cards, String[] suits, String[] cardsOfSuits, int i) {
        for (String card : cards) {
            for (String suit : suits) {
                cardsOfSuits[i] = card + " of " + suit;
                System.out.println(card + " of " + suit);
                i++;
            }
        }
        return cardsOfSuits;
    }
}
