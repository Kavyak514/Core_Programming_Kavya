package com.codetalksdna.CodingPrograms;

import com.codetalksdna.Arrays.SortingArrayElement;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = PushRandomDataToArray.pushDataToOneDArray(array.length);
        SortingArrayElement.sortElements(array);
        int largestElement = array[array.length-1];
        System.out.println("largest element " + largestElement);
    }
}
