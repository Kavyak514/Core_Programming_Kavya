package com.codetalksdna.FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerWriterClassFileIO {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("Kavya.txt");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")) {
                break;
            }
            fileWriter.write(line+'\n');
        }
        fileWriter.close();
    }
}
