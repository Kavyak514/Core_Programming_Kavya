package com.codetalksdna.ExceptionHandling;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) throws YoungAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age?");
        int age = scanner.nextInt();
        if (age < 18) {
            throw new YoungAgeException("You are below 18 Years so you can't cast Vote");
        } else {
            System.out.println("You are eligible to Vote");
        }
    }
}
