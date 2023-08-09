package com.codetalksdna.CoreJavaPrograms;

import java.util.Random;

public class MultiplicationTable {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(50);
        System.out.println("Number is "+number);
        for(int i =1; i <= 10; i++){
            System.out.println(+number+" * "+i+" = "+(number*i));
        }
    }
}
