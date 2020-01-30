package com.danila.serialization;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "students.txt");
        File file = path.toFile();

        String result;

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            while (scanner.hasNext()) {
                String next = scanner.nextLine();
                List<Integer> marks = Arrays.stream(next.split(" "))
                        .skip(1L)
                        .map(Integer::valueOf)
                        .collect(Collectors.toList());
                int average = 0;
                int sum = 0;
                for (int i = 0; i < marks.size(); i++) {
                    sum += marks.get(i);
                    average = i;
                }
                average = sum / average;
                if (average >= 7) {
                    System.out.println(next.substring(0, next.indexOf(" ")).toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
