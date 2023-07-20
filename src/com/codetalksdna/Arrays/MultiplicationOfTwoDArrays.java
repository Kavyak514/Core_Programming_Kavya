package com.codetalksdna.Arrays;

import java.util.Random;

import static com.codetalksdna.Arrays.PrintArrays.printTwoDArrays;

public class MultiplicationOfTwoDArrays {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] intArray = new int[2][3];
        int[][] intDataArray = new int[3][2];
        int[][] intDataArrays = new int[2][2];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[0].length; j++) {
                intArray[i][j] = random.nextInt(10);
            }
        }
        for (int i1 = 0; i1 < intDataArray.length; i1++) {
            for (int j1 = 0; j1 < intDataArray[0].length; j1++) {
                intDataArray[i1][j1] = random.nextInt(10);
            }
        }
        printTwoDArrays(intArray);
        System.out.println("-----------------------------");
        printTwoDArrays(intDataArray);
        System.out.println("-----------------------------");

        int firstArrRowsCount = intArray.length;
        int secondArrColsCount = intDataArray[0].length;
        if(firstArrRowsCount == secondArrColsCount ) {
            for (int i = 0; i < intArray.length; i++) {
                for (int j = 0; j < intDataArray[0].length; j++) {
                    intDataArrays[i][j] = 0;
                    for(int k = 0; k < intArray[0].length; k++) {
                        //TO-DO
                        intDataArrays[i][j] = intDataArrays[i][j] + (intArray[i][k] * intDataArray[k][j]);
                    }
                }
            }
        }
        printTwoDArrays(intDataArrays);
    }
}
