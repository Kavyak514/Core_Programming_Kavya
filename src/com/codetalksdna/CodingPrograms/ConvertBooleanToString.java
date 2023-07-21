package com.codetalksdna.CodingPrograms;

public class ConvertBooleanToString {
    public static void main(String[] args) {
        boolean val = true;
        String str = String.valueOf(val);
        String str1 = Boolean.toString(val);
        System.out.println("boolean is"+" "+val);
        System.out.println("String is"+" "+str);
        System.out.println("String is"+" "+str1);
    }
}
