package com.codetalksdna.CodingPrograms.TypeConversions;

public class ConvertStringToInt {
    public static void main(String[] args) {
        String str = "10";
        int i = Integer.parseInt(str);
        int i1 = Integer.valueOf(str);
        System.out.println("String is"+" "+str);
        System.out.println("Integer is"+" "+i);
        System.out.println("boolean is"+" "+i1);
    }
}
