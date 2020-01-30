package com.danila.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ComputerRun {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "serializedObject.txt");
        Computer computer = new Computer("ASUS", "Intel", "Seagate");

        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            output.writeObject(computer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
