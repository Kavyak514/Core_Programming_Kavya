package com.codetalksdna.CodingPrograms.TypeConversions;

public class ConvertIntToString {
    public static void main(String[] args) {
        int i = 20;
        String str = String.valueOf(i);
        String str1 = Integer.toString(i);
        System.out.println("Integer is"+" "+i);
        System.out.println("String is"+" "+str);
        System.out.println("String is"+" "+str1);
    }
}
