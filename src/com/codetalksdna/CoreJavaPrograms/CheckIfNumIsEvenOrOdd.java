package com.codetalksdna.CoreJavaPrograms;

import java.util.Random;
import java.util.Scanner;

public class CheckIfNumIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        checkIfGivenNumIsEvenOrOdd(number);
        Random random = new Random();
        int number1 = random.nextInt(500);
        checkIfGivenNumIsEvenOrOdd(number1);
    }

    public static void checkIfGivenNumIsEvenOrOdd(int number){
        if(number % 2 == 0){
            System.out.println("Number "+number+" is even");
        }else{
            System.out.println("Number \"+number+\" is odd");
        }
    }
}
