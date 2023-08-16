package com.codetalksdna.CodingPrograms;

public class OddOccurrences {

    static int findOddOccurrence(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result = result^num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 4, 2, 7, 5, 5, 7, 1};
        int oddOccurrence = findOddOccurrence(array);
        System.out.println("The number that occurs an odd number of times: " + oddOccurrence);
    }
}
