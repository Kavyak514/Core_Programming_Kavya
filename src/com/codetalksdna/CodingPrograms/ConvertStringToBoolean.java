package com.codetalksdna.CodingPrograms;

public class ConvertStringToBoolean {
    public static void main(String[] args) {
        String str = "true";
        //convert string to boolean
        Boolean val = Boolean.valueOf(str);
        System.out.println("String is"+" "+str);
        System.out.println("boolean is"+" "+val);

        //alternate way to convert string to boolean
        String str2 = "false";
        boolean val1 = Boolean.parseBoolean(str2);
        System.out.println("boolean is"+" "+val1);

    }
}
