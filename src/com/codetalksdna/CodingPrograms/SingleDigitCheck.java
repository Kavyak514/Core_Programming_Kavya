package com.codetalksdna.CodingPrograms;

import java.util.Random;

public class SingleDigitCheck {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(0, 100);
        boolean hasOnlyOneDigit = (number >= 0 && number < 10);
        if (hasOnlyOneDigit) {
            System.out.println("Numbered Entered was" + " " + number + " " + " and the number has only one digit.");
        } else {
            System.out.println("The number has more than one digit, Number entered was" + " " + number + " ");
        }
    }
}
