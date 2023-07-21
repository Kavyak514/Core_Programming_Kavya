package com.codetalksdna.CodingPrograms.TypeConversions;

import java.util.Arrays;

public class ConvertCharToString {
    public static void main(String[] args) {
        char c = 's';
        System.out.println("Character is" + " " + c);
        String str = Character.toString(c);
        System.out.println("String is" + " " + str);

        String str32 = String.valueOf(c);
        System.out.println("String is str32" + " " + str32);

        //convert char array to string
        char[] ch = {'k', 'a', 'v', 'y', 'a'};
        String str1 = String.valueOf(ch);
        String str2 = new String(ch);

        System.out.println("character array of string is" + " " + str1);
        System.out.println("character array of string2 is" + " " + str2);
    }
}
