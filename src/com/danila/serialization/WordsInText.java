package com.danila.serialization;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class WordsInText {
    public static void main(String[] args) {
        Map<String, Integer> wordsInText = new HashMap<>();

        Path path = Paths.get("resources", "Esenin.txt");
        File file = path.toFile();

        Path pathToWrite = Paths.get("resources", "EseninResult.txt");
        File fileToWrite = pathToWrite.toFile();

        String word;

        try(Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            while (scanner.hasNext()) {
                word = scanner.next().toLowerCase();
                if (wordsInText.containsKey(word)) {
                    wordsInText.put(word, wordsInText.get(word) + 1);
                } else {
                    wordsInText.put(word, 1);
                }
            }
            List<Map.Entry> list= new ArrayList<> (wordsInText.entrySet());

            String result = null;

            Map<String,Integer> resultMap = new LinkedHashMap<>();
            Stream<Map.Entry<String,Integer>> st = wordsInText.entrySet().stream();

            st.sorted(Comparator.comparing(e -> e.getValue()))
                    .forEach(e ->resultMap.put(e.getKey(),e.getValue()));


            result = resultMap.toString();
            System.out.println(result);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToWrite, true));
            bufferedWriter.append(result).flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
