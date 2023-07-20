package com.codetalksdna.Arrays;

import java.util.Random;

public class OneDArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
       PrintArrays.printOneDArrays(arr);
    }
}
