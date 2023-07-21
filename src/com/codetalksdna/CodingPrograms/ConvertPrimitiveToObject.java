package com.codetalksdna.CodingPrograms;

public class ConvertPrimitiveToObject {
    public static void main(String[] args) {
        int i = 10;
        Integer i5 = Integer.valueOf(i);
        System.out.println("Integer is" + " " + i5);

        //Object to integer
        int i6 = i5.intValue();
        System.out.println("Integer is" + " " + i6);
    }
}
