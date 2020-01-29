package com.danila.inputoutput;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadText {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "test.txt");
        File file = path.toFile();

        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            int current;
            while((current = inputStream.read()) != -1) {
                byte [] values = new byte[inputStream.available()];
                inputStream.read(values);
                System.out.println(Arrays.toString(values));
                String result = new String(values);
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
