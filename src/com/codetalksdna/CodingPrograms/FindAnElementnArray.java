package com.codetalksdna.CodingPrograms;

public class FindAnElementnArray {
    public static void main(String[] args) {
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
}
