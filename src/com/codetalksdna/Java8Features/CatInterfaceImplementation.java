package com.codetalksdna.Java8Features;

@FunctionalInterface
interface CatInterface {
    void eat();
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
