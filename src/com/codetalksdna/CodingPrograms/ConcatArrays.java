package com.codetalksdna.CodingPrograms;

import com.codetalksdna.Arrays.PrintArrays;

public class ConcatArrays {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[6];
        int totalLength = array1.length + array2.length;
        int[] concatenatedResult = new int[totalLength];
        array1 = PushRandomDataToArray.pushDataToOneDArray(array1.length);
        array2 = PushRandomDataToArray.pushDataToOneDArray(array2.length);
        for (int i = 0; i < array1.length; i++) {
            concatenatedResult[i] = array1[i];
        }
        for (int j = array1.length; j < totalLength; j++) {
            concatenatedResult[j] = array2[j-array1.length];
        }
        PrintArrays.printOneDArrays(concatenatedResult);
    }
}
