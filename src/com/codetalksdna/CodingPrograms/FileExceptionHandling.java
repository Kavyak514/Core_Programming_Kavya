package com.codetalksdna.CodingPrograms;

import java.io.*;

public class FileExceptionHandling {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("kavyaupdated.txt"));
            String fileData = bufferedReader.readLine();
            while (fileData != null) {
                System.out.println(fileData);
                fileData = bufferedReader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
