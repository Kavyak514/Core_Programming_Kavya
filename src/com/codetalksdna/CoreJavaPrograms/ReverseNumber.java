package com.codetalksdna.CoreJavaPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 543;
        System.out.println("number is "+number);
        int reversedNum = 0;
        while(number != 0){
            int remainder = number % 10;
            reversedNum = (reversedNum * 10) + remainder;
            number = number / 10;
        }
        System.out.println("reverse of is "+reversedNum);
        System.out.println("Number is not a palindrome");
    }
}
