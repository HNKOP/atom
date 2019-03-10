package ru.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Findword {

    public String filename = "dictionary.txt";

    public String getWord() throws IOException {

        Path path = Paths.get(filename);
        Scanner scanner = new Scanner(path);
        ArrayList<String> words
    }
}
