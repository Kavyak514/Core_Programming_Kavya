package com.codetalksdna.CodingPrograms;

public class ConvertIntToString {
    public static void main(String[] args) {
        int i = 20;
        //convert int to string
        String str = String.valueOf(i);
        System.out.println("Integer is"+" "+i);
        System.out.println("String is"+" "+str);

        //alternate way to convert int to string
        String str1 = Integer.toString(i);
        System.out.println("String is"+" "+str1);
    }
}
