package com.codetalksdna.CodingPrograms;

import com.codetalksdna.Arrays.SortingArrayElement;

import java.util.Random;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = PushRandomDataToArray.pushDataToOneDArray(array.length);
        array = SortingArrayElement.sortElements(array);
        int largestElement = array[array.length-1];
        System.out.println("");
        System.out.println("largest element " + largestElement);
    }
}
