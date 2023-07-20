package com.codetalksdna.CodingPrograms;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] array = new int[3][2];
        array = PushRandomDataToArray.pushDataToTwoDArray(array.length, array[0].length);
        int[][] transposedArray = new int[array[0].length][array.length];
        for(int i =0; i<array.length; i++){
            for(int j =0; j<array[0].length; j++){
                transposedArray[j][i] = array[i][j];
            }
        }
        System.out.println();
        System.out.println("transposed array data ");
        for(int i =0; i<transposedArray.length; i++){
            for(int j =0; j<transposedArray[0].length; j++){
                System.out.printf(" "+transposedArray[i][j]);
            }
            System.out.println();
        }


    }

}
