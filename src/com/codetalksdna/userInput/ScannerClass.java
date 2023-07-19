package com.codetalksdna.userInput;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number?");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Second Number?");
        int secondNumber = scanner.nextInt();
        int sum = getSum(firstNumber, secondNumber);
        System.out.println("Sum of First and Second Number is" + " " + sum);
    }

    private static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
