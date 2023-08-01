package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) throws ArithmeticException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the first number");
            int a = scanner.nextInt();
            System.out.println("Please enter the second number");
            int b = scanner.nextInt();
            int c = a / b;
            int[] a1 = new int[2];
            a1[2] = 3;
            System.out.println("test");
            System.out.println("division of two numbers is " + c);
        } catch (Exception e) {
            System.out.println("Welcome to Java");
        }
    }
}
