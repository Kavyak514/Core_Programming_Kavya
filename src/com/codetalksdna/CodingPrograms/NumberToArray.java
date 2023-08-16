package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class NumberToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String numberStr = Integer.toString(number);
        int[] digitsArray = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digitsArray[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        System.out.println("Array of digits:");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        scanner.close();
    }
}
