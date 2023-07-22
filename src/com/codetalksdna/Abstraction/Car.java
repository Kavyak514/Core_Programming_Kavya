package com.codetalksdna.Abstraction;

public class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("My Car Starts with an Ignition");
    }

    @Override
    void tyres() {
        System.out.println("My Car has four Tyres");
    }
}
