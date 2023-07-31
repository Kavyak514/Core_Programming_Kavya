package com.codetalksdna.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class UnCheckedException1 {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("Nitesh.txt");
        file.close();
        System.out.println("Welcome to Java");
    }
}
