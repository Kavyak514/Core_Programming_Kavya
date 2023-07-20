package com.codetalksdna.CodingPrograms;

import com.codetalksdna.Arrays.SortingArrayElement;

import java.util.Random;

public class ArrayOperations {
    public static void averageOfArray(String[] args) {
        int[] array = new int[7];
        array = PushRandomDataToArray.pushDataToOneDArray(array.length);
        int sum = 0;
        for(int i =0; i < array.length; i++){
            sum = sum + array[i];
        }
        float average = sum/ array.length;
        System.out.println();
        System.out.println("sum is " + sum);
        System.out.println("average is "+average);
    }

    public static void concatArrays(){
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
            System.out.print(" " +concatinatedResult[k]);
        }
    }

    public static void findAnElementnArray(String[] args) {
        int[] array = new int[5];
        array = PushRandomDataToArray.pushDataToOneDArray(array.length);
        int elementIndex = checkForAnElement(array, 7);
        System.out.println(" element to be found in the given array : 7");
        if(elementIndex == -1){
            System.out.println(" element is not found in the given array");
        }else{
            System.out.println(" element is found in the given array at index " +elementIndex);
        }

    }

    public static int checkForAnElement(int[] arraysData, int elementToFind){
        boolean elementFound = false;
        int elementIndex = -1;
        for(int i = 0; i <arraysData.length; i++){
            if(elementToFind == arraysData[i]){
                elementFound = true;
                elementIndex = i;
            }
        }
        return elementIndex;
    }

    public static void largestElementInAnArray(String[] args) {
        int[] array = new int[10];
        array = PushRandomDataToArray.pushDataToOneDArray(array.length);
        array = SortingArrayElement.sortElements(array);
        int largestElement = array[array.length-1];
        System.out.println("");
        System.out.println("largest element " + largestElement);
    }

    public static void swappingAnArray(String[] args) {
        int[] array = new int[2];
        Random random = new Random();
        array[0] = random.nextInt(20);
        array[1] = random.nextInt(2000);
        System.out.println("before sort first number: "+array[0]+ " secondNumber: " +array[1]);
        swapNumbers(array);
        System.out.println(" after sort first number: "+array[0]+ " secondNumber: " +array[1]);
    }

    public static int[] swapNumbers(int[] arrayNumbers){
        int temp = arrayNumbers[0];
        arrayNumbers[0] = arrayNumbers[1];
        arrayNumbers[1] = temp;
        return arrayNumbers;
    }

    public static void transposeArray(String[] args) {
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
