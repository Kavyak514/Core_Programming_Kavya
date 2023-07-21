package com.codetalksdna.CodingPrograms;

public class ArrayOperations {
    public static void averageOfArray() {
        int[] array = new int[7];
        array = PushRandomDataToArray.pushDataToOneDArray(array.length);
        double sum = 0;
        for(int i =0; i < array.length; i++){
            sum = sum + array[i];
        }
        double average = sum/array.length;
        System.out.println();
        System.out.println("Sum is  " + sum);
        System.out.println("Average is "+average);
    }
}
