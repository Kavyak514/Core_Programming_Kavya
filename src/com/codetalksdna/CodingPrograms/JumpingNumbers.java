package com.codetalksdna.CodingPrograms;

public class JumpingNumbers {
    static boolean isJumpingNumber(int num) {
        String numStr = Integer.toString(num);
        int n = numStr.length();
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(numStr.charAt(i) - numStr.charAt(i + 1));
            if (diff != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        System.out.println("Jumping numbers between " + lowerBound + " and " + upperBound + ":");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isJumpingNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
