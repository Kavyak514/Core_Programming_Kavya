package com.codetalksdna.userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number?");
        int firstNumber = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter Second Number?");
        int secondNumber = Integer.parseInt(bufferedReader.readLine());
        int sum = getSum(firstNumber, secondNumber);
        System.out.println("Sum of First and Second Number is" + " " + sum);
    }

    private static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
