package com.codetalksdna.CodingPrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingFileWithDoWhile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Kavya.txt"));
            String line;
            do{
                line = bufferedReader.readLine();
                System.out.println(line);
            }while(line != null);
        } catch (Exception e) {
            System.out.println("Reader with do while");
        }
    }
}

