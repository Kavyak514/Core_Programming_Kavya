package com.codetalksdna.ExceptionHandling;

//UnAcceptableCode
public class TryCatchCombo7 {
    public static void main(String[] args) {
        int number = 10;
        try {
            int value = number / 0;
        } catch (ArithmeticException e) {
            try {
                System.out.println("Welcome");
            } catch (Exception exception) {
                e.printStackTrace();
            }
        }
    }
}
