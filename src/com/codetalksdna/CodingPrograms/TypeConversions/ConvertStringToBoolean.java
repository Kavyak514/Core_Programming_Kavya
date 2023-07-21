package com.codetalksdna.CodingPrograms.TypeConversions;

public class ConvertStringToBoolean {
    public static void main(String[] args) {
        String str = "true";
        Boolean val = Boolean.valueOf(str);
        boolean val1 = Boolean.parseBoolean(str);

        System.out.println("String is"+" "+str);
        System.out.println("boolean is"+" "+val);
        System.out.println("boolean is"+" "+val1);

    }
}
