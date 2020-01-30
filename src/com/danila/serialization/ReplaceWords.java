package com.danila.serialization;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReplaceWords {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "testWords.txt");
        File file = path.toFile();

        Path pathToWrite = Paths.get("resources", "replaced.txt");
        File fileToWrite = pathToWrite.toFile();

        StringBuilder result = new StringBuilder();

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            while(scanner.hasNext()) {
                String next = scanner.nextLine();
                List<String> marks = Arrays.stream(next.split(" "))
                        .map(String::valueOf)
                        .collect(Collectors.toList());
                String temp = "";
                temp = marks.get(0);
                marks.set(0, marks.get(marks.size() - 1));
                marks.set(marks.size() - 1, temp);
                for (String mark : marks) {
                    result.append(mark);
                    result.append(" ");
                }
                result.append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToWrite, true))) {
            bufferedWriter.append(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
