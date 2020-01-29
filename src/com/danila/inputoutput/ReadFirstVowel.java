package com.danila.inputoutput;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFirstVowel {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "test.txt");
        File file = path.toFile();

        try(Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            while (scanner.hasNext()) {
                String next = scanner.next();
                if (isStartFromVowel(next)) {
                    System.out.println(next);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isStartFromVowel(String word) {
        return  (Character.toLowerCase("аоеяиюэыуё".indexOf(word.charAt(0))) != -1);
    }
}
