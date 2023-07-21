package com.codetalksdna.CodingPrograms;

public class ConvertIntToLong {
    public static void main(String[] args) {
        int i = 500;
        //convert int to long
        long l = i;
        System.out.println("Integer is"+" "+i);
        System.out.println("Long is"+" "+l);

        //alternate way to convert int to long
        long l1 = Long.valueOf(i);
        System.out.println("Long is"+" "+l1);
    }
}
