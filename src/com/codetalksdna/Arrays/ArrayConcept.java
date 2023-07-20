package com.codetalksdna.Arrays;

public class ArrayConcept {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrs = new int[10];

//        printArrays(arr);

        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = i;
        }
        printArrays(arrs);
    }

    public static void printArrays(int[] arr) {
        for (int j : arr) {
            System.out.print(j +" ");
        }
    }
}
