package com.codetalksdna.CoreJavaPrograms;

import java.util.Random;
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstNum = scanner.nextInt();
        Random random = new Random();
        int secondNum = random.nextInt(100);
        System.out.println("Before swapping first number is "+firstNum+" second number is "+secondNum);
        swapTwoNumbers(firstNum, secondNum);
    }

    public static void swapTwoNumbers(int firstNum, int secondNum){
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("Before swaping first number is "+firstNum+" second number is "+secondNum);
    }
}
