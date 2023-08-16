package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[] names = new String[numStudents];
        int[] marks = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter the marks obtained by " + names[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Name: " + names[i] + ", Marks: " + marks[i]);
        }
        scanner.close();
    }
}
