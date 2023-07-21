package com.codetalksdna.CodingPrograms;

import com.codetalksdna.Arrays.PrintArrays;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] array = new int[3][2];
        int row = 3;
        int column = 2;
        array = PushRandomDataToArray.pushDataToTwoDArray(row, column);
        int[][] transposedArray = new int[column][row];
        System.out.println();
        System.out.println("transposed array data ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }
        PrintArrays.printTwoDArrays(transposedArray);
    }
}
