package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class TryCatchThrow {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the first number");
            int a = scanner.nextInt();
            System.out.println("Please enter the second number");
            int b = scanner.nextInt();
            double d = getDivisionOfNumbers(a, b);
            System.out.println("division of "+a + " and " + b+ " is "+d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double getDivisionOfNumbers(int a, int b) {
        if(b == 0){
            throw new ArithmeticException("division by zero");
        }
        return a/b;
    }
}
