package com.danila.inputoutput;

import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LettersInText {
    public static void main(String[] args) {
        Map<Character, Integer> lettersInText = new HashMap<>();

        Path path = Paths.get("resources", "test.txt");
        File file = path.toFile();

        Path pathToWrite = Paths.get("resources", "result.txt");
        File fileToWrite = pathToWrite.toFile();

        char letter;

            try(Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
                while (scanner.hasNext()) {
                    String next = scanner.next();
                    for (int i = 0; i < next.length(); i++) {
                        letter = next.charAt(i);
                        if (Character.isLetter(letter)) {
                            letter = Character.toLowerCase(letter);
                            if (lettersInText.containsKey(letter)) {
                                lettersInText.put(letter, lettersInText.get(letter) + 1);
                            } else {
                                lettersInText.put(letter, 1);
                            }
                        }
                    }
                }
            String result = lettersInText.toString();
            System.out.println(result);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToWrite, true));
            bufferedWriter.append(result).flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
