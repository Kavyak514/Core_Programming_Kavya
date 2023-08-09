package com.codetalksdna.CoreJavaPrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of natural numbers");
        int n = scanner.nextInt();
        int sumOfNum = n*(n+1)/2;
        int sumOfNum1 = 0;
        for(int i =0; i <= n; i++){
             sumOfNum1 = sumOfNum1 + i;
        }
        System.out.println("Sum of natural numbers by till n is " +sumOfNum);
        System.out.println("Sum of natural numbers by for loop till n is " +sumOfNum1);
    }
}
