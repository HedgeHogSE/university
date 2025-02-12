package ru.ezhak.reflection.workWithFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ObjectsReader <T> {
    public String name;

    public ObjectsReader(String name) {
        this.name = name;
    }

    public void read () throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }
    }
}
