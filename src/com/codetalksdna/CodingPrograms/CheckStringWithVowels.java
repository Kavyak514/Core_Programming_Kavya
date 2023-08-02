package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class CheckStringWithVowels {
    public static void main(String[] args) throws StringWithVowelsExceptionClass{
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the string");
        String str = scanner.next();
        checkIfStringHasVowels(str);
    }

    private static void checkIfStringHasVowels(String str) throws StringWithVowelsExceptionClass{
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean vowelsFound = false;
        for(int i = 0; i < vowels.length; i++){
            char ch = vowels[i];
            String str1 = str.toLowerCase();
            if(str1.contains(String.valueOf(ch))){
                vowelsFound = true;
                System.out.println("vowel found "+ch);
            }
        }

        if(!vowelsFound){
            throw new StringWithVowelsExceptionClass("String does not has any vowels");
        }
    }
}
