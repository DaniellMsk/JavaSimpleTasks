package com.danila.inputoutput;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CodeReplace {
    public static void main(String[] args) {
        Path path = Paths.get("src", "com", "danila", "helloworld", "HelloWorld.java");
        File file = path.toFile();

        Path pathToWrite = Paths.get("resources", "ModifiedCode.java");
        File fileToWrite = pathToWrite.toFile();

        try(Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            StringBuilder code = new StringBuilder();
            while (scanner.hasNext()) {
                code.append(scanner.nextLine().replace("public", "private"));
                code.append("\n");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToWrite, true));
            bufferedWriter.append(code.toString()).flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
