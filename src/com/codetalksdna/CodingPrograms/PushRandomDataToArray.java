package com.codetalksdna.CodingPrograms;

import java.util.Random;

public class PushRandomDataToArray {
    public static int[] pushDataToOneDArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static int[][] pushDataToTwoDArray(int rowSize, int colSize) {
        int[][] array = new int[rowSize][colSize];
        Random random = new Random();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        return array;
    }
}
