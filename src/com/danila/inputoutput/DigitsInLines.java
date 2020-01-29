package com.danila.inputoutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DigitsInLines {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "test.txt");
        File file = path.toFile();

        try(Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            String prev = "/";

            while (scanner.hasNext()) {
                int maxDigitsInLine = 0;
                String next = scanner.nextLine();
                int digitSequence = 0;
                for (int i = 0; i < next.length(); i++) {
                    if (Character.isDigit(next.charAt(i))){
                        digitSequence++;
                        if (maxDigitsInLine < digitSequence) {
                            maxDigitsInLine = digitSequence;
                        }
                    } else {
                        digitSequence = 0;
                    }
                }
                System.out.println(maxDigitsInLine + ": " + next);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
