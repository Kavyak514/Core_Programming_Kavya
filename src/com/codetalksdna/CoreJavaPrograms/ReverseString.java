package com.codetalksdna.CoreJavaPrograms;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Kavya";
        String reversedStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            reversedStr = reversedStr + str.charAt(i);
        }
        System.out.println("Reverse string of "+str+" is "+reversedStr);
        if(str.equalsIgnoreCase(reversedStr)){
            System.out.println("string " +str+" is a palindrome");
        }else{
            System.out.println("String " +str+" is not a palindrome");
        }
    }
}
