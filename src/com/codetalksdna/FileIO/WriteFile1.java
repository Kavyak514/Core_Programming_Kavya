package com.codetalksdna.FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> students = new ArrayList<>();
        students.add("John1");
        students.add("Jane1");
        students.add("Doe1");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Kavya.txt");
            for (String studentName : students) {
                fileWriter.write(studentName + '\n');
            }
        } catch (Exception e) {
            System.out.println("Anything is fine");
        } finally {
            fileWriter.close();
        }
    }
}
