package com.danila.setmap;

import java.util.HashMap;

public class EnglishText {
    public static void main(String[] args) {
        String englishText = "Then, they heard a loud noise coming from" +
                " a cupboard in the corner of the room. “What’s that?” " +
                "Amy was frightened. “I didn’t hear anything,” said Kamal." +
                " Something was making strange noises. There was something inside" +
                " the cupboard. “Oh no! What is it?” Amy was very frightened now. " +
                "“What do you mean? There’s nothing there!” Kamal was trying not to smile." +
                " Suddenly the door opened with a bang and a zombie appeared, shouting and" +
                "moving its arms. Amy screamed and covered her eyes. “Oh very funny, Grant!”" +
                " said Tara looking bored. Kamal and Grant started laughing.";

        HashMap<String, Integer> words = new HashMap<>();

        int firstIndex = 0;
        int secondIndex = 0;

        while (true) {

            englishText = englishText.trim();
            String word = "";

            if (englishText.contains(" ")){
                secondIndex = englishText.indexOf(' ');
                word = englishText.substring(firstIndex, secondIndex);
            } else {
                break;
            }

            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            } else {
                words.put(word, 1);
            }
            englishText = englishText.substring(secondIndex);
        }

        System.out.println(words.toString());

    }
}
