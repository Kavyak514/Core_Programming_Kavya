package com.codetalksdna.CodingPrograms;

import java.util.Arrays;
import java.util.Random;

public class SwapNumbers {
    public static void main(String[] args) {
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
}
