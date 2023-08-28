package com.codetalksdna.CodingPrograms;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileEmptyExceptionHandling {
    public static void main(String[] args) throws IOException {
        try {
            checkIfTheFileIsEmpty("kavyaupdated.txt");
        } catch (FileEmptyCustomExceptionClass e) {
            e.printStackTrace();
        }
    }

    private static void checkIfTheFileIsEmpty(String file) throws IOException, FileEmptyCustomExceptionClass {
        FileReader fileReader = new FileReader("kavyaupdated.txt");
        Scanner scanner = new Scanner(fileReader);
        if (!scanner.hasNextLine()) {
            throw new FileEmptyCustomExceptionClass("file is empty");
        }
    }
}
