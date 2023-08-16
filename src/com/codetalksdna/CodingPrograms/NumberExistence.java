package com.codetalksdna.CodingPrograms;

import java.util.HashSet;

public class NumberExistence {
    static boolean numberExists(int[] array, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        return set.contains(target);
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 9, 5, 3};
        int target = 7;
        if (numberExists(array, target)) {
            System.out.println(target + " exists in the array.");
        } else {
            System.out.println(target + " does not exist in the array.");
        }
    }
}
