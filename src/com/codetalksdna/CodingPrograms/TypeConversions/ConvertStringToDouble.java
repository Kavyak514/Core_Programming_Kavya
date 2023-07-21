package com.codetalksdna.CodingPrograms.TypeConversions;

public class ConvertStringToDouble {
    public static void main(String[] args) {
        String str = "40.5";
        double d = Double.valueOf(str);
        System.out.println("String is" + " " + str);
        System.out.println("Double is" + " " + d);

        double d2 = Double.parseDouble(str);
        System.out.println("Double is" + " " + d2);

        String str1 = "3";
        double d1 = Double.valueOf(str1);
        System.out.println("String is" + " " + str1);
        System.out.println("Double is" + " " + d1);

    }
}
