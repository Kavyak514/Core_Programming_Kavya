package com.codetalksdna.CodingPrograms;

public class ConvertStringToDouble {
    public static void main(String[] args) {
        String str = "40.5";
        //convert string to double
        double d = Double.valueOf(str);
        System.out.println("String is" + " " + str);
        System.out.println("Double is" + " " + d);

        //alternate way to convert string to double
        double d2 = Double.parseDouble(str);
        System.out.println("Double is" + " " + d2);

        //convert string to double
        String str1 = "3";
        double d1 = Double.valueOf(str1);
        System.out.println("String is" + " " + str1);
        System.out.println("Double is" + " " + d1);
    }
}
