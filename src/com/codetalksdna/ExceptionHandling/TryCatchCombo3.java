package com.codetalksdna.ExceptionHandling;

public class TryCatchCombo3 {
    public static void main(String[] args) {
        int number = 10;
        try {
            int value = number / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
