package com.codetalksdna.Arrays;

import java.util.Random;

import static com.codetalksdna.Arrays.PrintArrays.printTwoDArrays;

public class MultiplicationOfTwoDArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] intArray = new int[2][2];
        int[][] intDataArray = new int[2][2];
        int[][] intDataArrays = new int[2][2];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                intArray[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < intDataArray.length; i++) {
            for (int j = 0; j < intDataArray.length; j++) {
                intDataArray[i][j] = random.nextInt(10);
            }
        }
        printTwoDArrays(intArray);
        System.out.println("-----------------------------");
        printTwoDArrays(intDataArray);
        System.out.println("-----------------------------");

        int firstArrRowsCount = intArray.length;
        int secondArrColsCount = intDataArray[0].length;
        if(firstArrRowsCount == secondArrColsCount ) {
            for (int i = 0; i < intDataArray.length; i++) {
                for (int j = 0; j < intDataArray.length; j++) {
                    intDataArrays[i][j] = 0;
                    for(int k = 0; k < intDataArray.length; k++) {
                        //TO-DO
                        intDataArrays[i][j] = intDataArrays[i][j] + (intArray[i][k] * intDataArray[k][j]);
                    }
                }
            }
        }
        printTwoDArrays(intDataArrays);
    }
}
