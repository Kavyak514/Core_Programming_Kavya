package com.codetalksdna.CoreJavaPrograms;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = scanner.nextInt();
        if(year % 4 == 0){
            System.out.println(+year+" is a leap year");
        }else{
            System.out.println(+year+" is not a leap year");
        }
    }
}
