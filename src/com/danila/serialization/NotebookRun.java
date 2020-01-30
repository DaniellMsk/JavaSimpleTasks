package com.danila.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NotebookRun {
    public static void main(String[] args) {
        Path path = Paths.get("resources", "serializedNotebook.txt");
        Computer notebook = new Notebook("ASUS", "Intel", "Seagate", new Touchpad(25), 3);

        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            output.writeObject(notebook);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
