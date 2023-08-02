package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class OddNumberCustomException {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the first number");
            int a = scanner.nextInt();
            System.out.println("Please enter the selc d number");
            int b = scanner.nextInt();
            checkWhetherNumberIsOdd(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void checkWhetherNumberIsOdd(int a, int b) throws OddNumCustomExceptionClass {
        if(a%2 != 0){
            throw new IllegalArgumentException("Number is odd");
        }
        System.out.println(a/b);
    }
}
