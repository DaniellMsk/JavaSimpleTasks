package com.danila.inputoutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "test.txt");
        File file = path.toFile();

        try(Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            String prev = "/";

            while (scanner.hasNext()) {
                String next = scanner.next();
                if (Character.toLowerCase(next.charAt(0)) == Character.toLowerCase(prev.charAt(prev.length() - 1))) {
                    System.out.println(prev + " " + next);
                }
                prev = next;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
