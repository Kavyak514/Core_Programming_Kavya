package com.codetalksdna.CoreJavaPrograms;

import java.util.Random;
import java.util.Scanner;

public class AlphabetVowelOrConsonant {
    public static void main(String[] args) {
        Random random = new Random();
        char alphabet = (char) random.nextInt(100);
        checkAlphabetIsVowel(alphabet);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an alphabet");
        char alphabet1 = scanner.next().charAt(0);
        if(!Character.isDigit(alphabet1)) {
            checkAlphabetIsVowel(alphabet1);
        }else{
            System.out.println("Please enter an alphabet");
        }
    }

    public static void checkAlphabetIsVowel(char alphabet){
        boolean isVowel = false;
        char[] vowels = new char[]{'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            if (vowel == alphabet) {
                isVowel = true;
                break;
            }
        }
        if(isVowel){
            System.out.println("Alphabet "+alphabet+" is vowel");
        }else{
            System.out.println("Alphabet "+alphabet+" is consonant");
        }
    }
}
