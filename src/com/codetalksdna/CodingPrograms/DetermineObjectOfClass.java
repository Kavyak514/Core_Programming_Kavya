package com.codetalksdna.CodingPrograms;

public class DetermineObjectOfClass {
    public static void main(String[] args) {
        // printing class of an object
        DetermineObjectOfClass determineObjectOfClass = new DetermineObjectOfClass();
        String className = determineObjectOfClass.getClass().toString();
        System.out.println("Class Name =" + " " + className);
        //Printing object of a class
        System.out.println(determineObjectOfClass);
    }
}
