package com.codetalksdna.CodingPrograms;

public class ConvertStringToInt {
    public static void main(String[] args) {
        String str = "10";
        //Convert string to int
        int i = Integer.parseInt(str);
        System.out.println("String is"+" "+str);
        System.out.println("Integer is"+" "+i);

        //alternate way to convert string to int
        int i1 = Integer.valueOf(str);
        System.out.println("boolean is"+" "+i1);
    }
}
