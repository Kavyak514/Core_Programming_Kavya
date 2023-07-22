package com.codetalksdna.Abstraction;

public abstract class Vehicle {
    abstract void start();

    abstract void tyres();

    void fuel() {
        System.out.println("The Vehicle will always run with Fuel");
    }
}
