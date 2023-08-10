package com.codetalksdna.Java8Features;

interface DefaultStaticInterface {

    void eat();

    default void sleep() {
        System.out.println("Cat is sleeping");
    }

    static void drink() {
        System.out.println("Cat is Drinking");
    }
}

public class CatDefaultStaticInterface implements DefaultStaticInterface {

    @Override
    public void eat() {
        System.out.println("Cat is Eating");
    }

    @Override
    public void sleep() {
        DefaultStaticInterface.super.sleep();
    }

    public static void main(String[] args) {
        CatDefaultStaticInterface catDefaultStaticInterface = new CatDefaultStaticInterface();
        catDefaultStaticInterface.eat();
        catDefaultStaticInterface.sleep();
        DefaultStaticInterface.drink();
    }
}
