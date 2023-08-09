package com.codetalksdna.CoreJavaPrograms;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scanner.nextInt();
        System.out.println("Please enter the power");
        int power = scanner.nextInt();
        long powerOfNum = 1;
        for(int i =0; i < power; i++){
            powerOfNum = powerOfNum * num;
        }
        System.out.println("Power of the number is "+powerOfNum);
    }
}
