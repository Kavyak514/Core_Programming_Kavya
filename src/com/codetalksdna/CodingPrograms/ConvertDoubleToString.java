package com.codetalksdna.CodingPrograms;

public class ConvertDoubleToString {
    public static void main(String[] args) {
        double d = 45.2;
        //convert double to string
        String str = String.valueOf(d);
        System.out.println("Double is" + " " + d);
        System.out.println("String is" + " " + str);

        //alternate way to convert double to string
        String str1 = Double.toString(d);
        System.out.println("String is" + " " + str1);
    }
}
