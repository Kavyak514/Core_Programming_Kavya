package com.codetalksdna.CodingPrograms;

public class ConvertCharToInt {
    public static void main(String[] args) {
        char c = 'a';
        char c1 = '5';
        System.out.println("Character1 is"+" "+c);
        System.out.println("Character2 is"+" "+c1);

        int i = c;
        int i2 = Integer.parseInt(String.valueOf(c1));
        System.out.println("Integer is i"+" "+i);
        System.out.println("Integer is"+" "+i2);
    }
}
