package com.danila.serialization;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ComputerDeserialize {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "serializedObject.txt");

        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Computer computer = (Computer) input.readObject();
            System.out.println(computer.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
