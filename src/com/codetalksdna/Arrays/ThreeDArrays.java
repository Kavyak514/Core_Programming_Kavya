package com.codetalksdna.Arrays;

import java.util.Random;

//To-Do Task
public class ThreeDArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][] intArray = new int[3][3][3];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                for (int k = 0; k < intArray.length; k++) {
                    intArray[i][j][k] = random.nextInt(10);
                }
            }
        }
        PrintArrays.printThreeDArrays(intArray);
    }
}
