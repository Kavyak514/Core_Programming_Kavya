package com.codetalksdna.Arrays;

public class ArrayConcept {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrs = new int[10];

        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = i;
        }
        printArrays(arrs);
        printArrays(arr);
    }

    public static void printArrays(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
