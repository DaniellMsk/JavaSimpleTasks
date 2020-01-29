package com.danila.inputoutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt(100));
        }

        Collections.sort(integers);

        Path pathToWrite = Paths.get("resources", "SortedValues.txt");
        File fileToWrite = pathToWrite.toFile();

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(fileToWrite, true));
            bufferedWriter.append(integers.toString()).flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
