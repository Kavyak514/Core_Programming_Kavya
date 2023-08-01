package com.codetalksdna.FileIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFile1 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Kavya.txt");
            fileReader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
