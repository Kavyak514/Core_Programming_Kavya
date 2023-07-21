package com.codetalksdna.CodingPrograms;

public class ConvertStringToChar {
    public static void main(String[] args) {
        String str = "kavya";
        //convert string to char, results into char[]
        char[] c = str.toCharArray();
        for (char i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
