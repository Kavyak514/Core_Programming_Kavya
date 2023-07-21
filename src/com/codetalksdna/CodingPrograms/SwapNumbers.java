package com.codetalksdna.CodingPrograms;

import java.util.Random;

public class SwapNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        System.out.println("Before sort First number:" + " " + number1 + " SecondNumber: " + " " + number2);
        swapNumbers(number1, number2);
    }

    public static void swapNumbers(int number1, int number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After sort First number:" + " " + number1 + " SecondNumber: " + " " + number2);
    }
}
