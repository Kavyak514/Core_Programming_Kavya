package com.codetalksdna.CodingPrograms;

public class ConvertIntToLong {
    public static void main(String[] args) {
        int i = 500;
        long l = i;
        long l1 = Long.valueOf(i);
        System.out.println("Integer is"+" "+i);
        System.out.println("Long is"+" "+l);
        System.out.println("Long is"+" "+l1);
    }
}
