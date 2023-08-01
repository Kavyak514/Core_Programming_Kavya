package com.codetalksdna.FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Jane");
        students.add("Doe");
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("Kavya.txt"));
            for (String studentName : students) {
                bufferedWriter.write(studentName + '\n');
            }
        } catch (Exception e) {
            System.out.println("Anything is fine");
        } finally {
            bufferedWriter.close();
        }
    }
}
