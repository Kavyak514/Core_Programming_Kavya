package com.codetalksdna.CodingPrograms;

public class ConvertDoubleToString {
    public static void main(String[] args) {
        double d = 45.2;
        String str = String.valueOf(d);
        String str1 = Double.toString(d);
        System.out.println("Double is" + " " + d);
        System.out.println("String is" + " " + str);
        System.out.println("String is" + " " + str1);
    }
}
