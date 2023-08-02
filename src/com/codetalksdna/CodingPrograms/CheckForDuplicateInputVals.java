package com.codetalksdna.CodingPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckForDuplicateInputVals {
    public static void main(String[] args) throws CheckForDuplicateValsExceptionCls{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers list length");
        int length = scanner.nextInt();
        System.out.println("please enter the numbers");
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0 ; i < length; i++){
            numbers.add(scanner.nextInt());
        }
        System.out.println("length of the list is reached");
        checkForDuplicateVals(numbers);
    }

    private static void checkForDuplicateVals(ArrayList<Integer> numbers) throws CheckForDuplicateValsExceptionCls{
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int j=0; j<numbers.size(); j++){
            if(uniqueNumbers.contains(numbers.get(j))){
                throw new CheckForDuplicateValsExceptionCls("duplicates found "+numbers.get(j));
            }
            uniqueNumbers.add(numbers.get(j));
        }
    }
}
