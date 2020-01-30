package com.danila.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NotebookDeserialize {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "serializedNotebook.txt");

        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Computer notebook = (Computer) input.readObject();
            System.out.println(notebook.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
