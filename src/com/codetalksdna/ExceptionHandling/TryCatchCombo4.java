package com.codetalksdna.ExceptionHandling;

public class TryCatchCombo4 {
    public static void main(String[] args) {
        int number = 10;
        try {
            int value = number / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Welcome to Java");
        }
    }
}
