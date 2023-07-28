package com.codetalksdna.ExceptionHandling;

public class TryCatchCombo2 {
    public static void main(String[] args) {
        int number = 10;
        try {
            try {
                int value = number / 0;
            } catch (Exception e) {
                System.out.println("Welcome to Java");
            }
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }
    }
}
