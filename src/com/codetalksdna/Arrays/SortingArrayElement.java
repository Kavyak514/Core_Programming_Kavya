package com.codetalksdna.Arrays;

import java.util.Random;

public class SortingArrayElement {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10);
        }
        System.out.println("Before Sorting elements are:-");
        PrintArrays.printOneDArrays(arrays);
        sortElements(arrays);
        System.out.println("After Sorting elements are:-");
        PrintArrays.printOneDArrays(arrays);
    }

    public static void sortElements(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                swapElements(arrays, i, j);
            }
        }
    }

    private static void swapElements(int[] arrays, int i, int j) {
        if (arrays[i] > arrays[j]) {
            int temp = arrays[i];
            arrays[i] = arrays[j];
            arrays[j] = temp;
        }
    }
}