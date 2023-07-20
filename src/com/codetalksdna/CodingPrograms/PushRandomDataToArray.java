package com.codetalksdna.CodingPrograms;

import java.util.Random;

public class PushRandomDataToArray {
    public static int[] pushDataToOneDArray(int size){
        int[] array = new int[size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(10);
        }
        for(int j = 0; j < size; j++){
            System.out.printf(" "+array[j]);
        }
        return array;
    }

    public static int[][] pushDataToTwoDArray(int rowSize, int colSize){
        int[][] array = new int[rowSize][colSize];
        Random random = new Random();
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j <colSize; j++){
                array[i][j] = random.nextInt(2000);
            }
        }
        System.out.println("inserted array data ");
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j <colSize; j++){
                System.out.printf(" "+array[i][j]);
            }
            System.out.println();
        }
        return array;
    }
}
