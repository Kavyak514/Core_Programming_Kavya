package com.codetalksdna.FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReaderClassFileIO {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("Kavya.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
