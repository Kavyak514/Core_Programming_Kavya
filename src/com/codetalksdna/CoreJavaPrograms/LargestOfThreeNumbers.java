package com.codetalksdna.CoreJavaPrograms;

import java.util.Random;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int firstNum = random.nextInt(500);
        int secondNum = random.nextInt(500);
        int thirdNum = random.nextInt(500);
        findLargestOfThreeNums(firstNum, secondNum, thirdNum);
        int[] intArray = new int[10];
        for(int i =0; i <10; i++){
            intArray[i] = random.nextInt(1000);
        }
        findLargestOfAllNums(intArray);
    }

    public static void findLargestOfThreeNums(int firstNum, int secondNum, int thirdNum){
        int largeNum = firstNum;
        if(secondNum > firstNum){
            largeNum = secondNum;
        }
        if(thirdNum > largeNum){
            largeNum = thirdNum;
        }
        System.out.println("Largest number among "+ firstNum+", "+secondNum+", "+thirdNum+" is " + largeNum);
    }

    public static void findLargestOfAllNums(int[] intArray){
        int largestNum = intArray[0];
        for(int i = 0; i < intArray.length-1;i++){
            System.out.print(intArray[i]);
            System.out.print(" ");
            if(intArray[i+1] > largestNum){
                largestNum = intArray[i+1];
            }else{
                largestNum = largestNum;
            }
        }
        System.out.print(intArray[intArray.length-1]);
        System.out.println();
        System.out.println("Largest element in all numbers is "+largestNum);
    }
}
