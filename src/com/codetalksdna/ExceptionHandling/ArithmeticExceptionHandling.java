package com.codetalksdna.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 10;
        try {
            int value = number / scanner.nextInt();
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
