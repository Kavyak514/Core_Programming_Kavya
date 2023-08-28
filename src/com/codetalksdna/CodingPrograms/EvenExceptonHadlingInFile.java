package com.codetalksdna.CodingPrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class EvenExceptonHadlingInFile {
    public static void main(String[] args) throws OddNumCustomExceptionClass {
        readFileContent("kavyaupdated.txt");
    }

    private static void readFileContent(String file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String numberStr = bufferedReader.readLine();
            while (numberStr != null) {
                int number = Integer.parseInt(numberStr);
                if (number % 2 == 0) {
                    throw new OddNumCustomExceptionClass("its an even number");
                } else {
                    System.out.println(number);
                    numberStr = bufferedReader.readLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
