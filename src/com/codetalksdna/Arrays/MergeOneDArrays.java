package com.codetalksdna.Arrays;

import java.util.Random;

public class MergeOneDArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }
        PrintArrays.printOneDArrays(arr1);
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10);
        }
        PrintArrays.printOneDArrays(arr2);
        System.out.println();

        int[] arr3 = new int[10];
        for (int k = 0; k < arr3.length; k++) {
            arr3[k] = arr1[k] + arr2[k];
        }
        PrintArrays.printOneDArrays(arr3);
    }
}
