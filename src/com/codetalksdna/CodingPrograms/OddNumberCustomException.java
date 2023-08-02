package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class OddNumberCustomException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number");
            int a = scanner.nextInt();
            checkWhetherNumberIsOdd(a);
        } catch (OddNumCustomExceptionClass e) {
            e.printStackTrace();
        }
    }

    private static void checkWhetherNumberIsOdd(int a) throws OddNumCustomExceptionClass {
        if (a % 2 != 0) {
            throw new OddNumCustomExceptionClass("Number is odd");
        }
        System.out.println("Number " + a + " is even");
    }
}
