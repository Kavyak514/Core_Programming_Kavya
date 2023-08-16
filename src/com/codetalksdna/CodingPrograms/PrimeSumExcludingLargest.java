package com.codetalksdna.CodingPrograms;

public class PrimeSumExcludingLargest {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumOfPrimesExcludingLargest(int[] arr) {
        int sum = 0;
        int largestPrime = 0;

        for (int num : arr) {
            if (isPrime(num)) {
                if (num > largestPrime) {
                    sum += largestPrime;
                    largestPrime = num;
                } else {
                    sum += num;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 10, 5, 13, 2, 17};
        int result = sumOfPrimesExcludingLargest(array);
        System.out.println("Sum of prime numbers excluding the largest prime: " + result);
    }
}
