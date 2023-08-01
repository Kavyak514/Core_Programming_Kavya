package com.codetalksdna.FileIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingFile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Kavya.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Anything is fine");
        }
    }
}
