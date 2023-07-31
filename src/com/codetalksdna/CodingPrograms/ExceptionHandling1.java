package com.codetalksdna.CodingPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the first number");
            int a = scanner.nextInt();
            System.out.println("Please enter the second number");
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println("division of two numbers is " + c);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
