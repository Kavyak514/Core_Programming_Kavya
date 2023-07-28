package com.codetalksdna.ExceptionHandling;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        int number = 10;
        try {
            int value = number / 0;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }
    }
}
