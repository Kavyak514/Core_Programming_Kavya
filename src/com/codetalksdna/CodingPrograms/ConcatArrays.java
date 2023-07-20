package com.codetalksdna.CodingPrograms;

public class ConcatArrays {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[6];
        int totalLength = array1.length + array2.length;
        int [] concatinatedResult = new int[totalLength];
        array1 = PushRandomDataToArray.pushDataToOneDArray(array1.length);
        System.out.println("");
        array2 = PushRandomDataToArray.pushDataToOneDArray(array2.length);
        for(int i = 0; i <array1.length ; i++){
            concatinatedResult[i] = array1[i];
        }
        for(int j = 0; j < array2.length ; j++){
            concatinatedResult[j+array1.length] = array2[j];
        }
        System.out.println(" concatinated array data");
        for(int k = 0; k < totalLength ; k++){
            System.out.print(" " +concatinatedResult[k]);        }
    }
}
