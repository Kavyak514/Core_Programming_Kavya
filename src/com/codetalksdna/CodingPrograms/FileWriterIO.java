package com.codetalksdna.CodingPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterIO {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("kavyaupdated.txt"));
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if ((data.equalsIgnoreCase("Stop"))) {
                    break;
                }
                bufferedWriter.write(data + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            bufferedWriter.close();
        }
    }
}
