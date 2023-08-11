package com.codetalksdna.Java8Features;

@FunctionalInterface
interface CatInterface {
    void eat();

    default void sleep() {
        System.out.println("Cat is sleeping");
    }

    static void drink() {
        System.out.println("Cat is drinking");
    }
}

public class CatInterfaceImplementation implements CatInterface {
    public static void main(String[] args) {
        CatInterfaceImplementation catInterfaceImplementation = new CatInterfaceImplementation();
        catInterfaceImplementation.eat();
    }

    @Override
    public void eat() {
        System.out.println("The Cat Eats her food..!");
    }
}
