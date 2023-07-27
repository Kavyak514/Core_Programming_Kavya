package com.codetalksdna.CodingPrograms;

import java.util.Random;
import java.util.Scanner;

public class StudentClassMain {
    public static void main(String[] args) {
        Student student = new Student();
        Random random = new Random();
        student.setSid(random.nextInt(10));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student name");
        student.setsName(scanner.next());
        System.out.println("Please enter student grade");
        if(scanner.hasNextFloat()){
            student.addGrade(scanner.nextFloat());
            System.out.println("Student id is " + student.getSid() + " student name is " + student.getsName()+"" +
                    "and student grade is "+student.getGrade());
        }else{
            System.out.println("Please enter student grade in numbers");
        }
    }
}
