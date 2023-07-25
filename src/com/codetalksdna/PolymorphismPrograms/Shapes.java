package com.codetalksdna.PolymorphismPrograms;

public class Shapes {
    public static void main(String[] args) {
        shape(20, 30);
        shape(20);
    }

    public static void shape(int length, int breadth) {
        System.out.println(length * breadth + " " + "It is an Area of Rectangle");
    }

    public static void shape(int side) {
        System.out.println(side * side + " " + "It is an Area of Square");
    }
}
