package com.codetalksdna.Arrays;

public class PrintArrays {
    public static void printTwoDArrays(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printOneDArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printThreeDArrays(int[][][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                for (int k = 0; k < ints.length; k++) {
                    System.out.print(ints[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
