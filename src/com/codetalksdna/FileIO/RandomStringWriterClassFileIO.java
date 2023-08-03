package com.codetalksdna.FileIO;

import java.io.FileWriter;
import java.io.IOException;

import static com.codetalksdna.CodingPrograms.RandomString.getRandomStrings;

public class RandomStringWriterClassFileIO {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Kavya.txt");
        for (String line : getRandomStrings()) {
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            fileWriter.write(line + '\n');
        }
        fileWriter.close();
    }
}
