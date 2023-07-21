package com.codetalksdna.CodingPrograms;

public class ConvertIntToDouble {
    public static void main(String[] args) {
        int i = 20;
        //convert int to double
        double d = i;
        System.out.println(d);

        //alternate way convert int to double
        double d1 = Double.valueOf(i);
        System.out.println(d1);
    }
}
