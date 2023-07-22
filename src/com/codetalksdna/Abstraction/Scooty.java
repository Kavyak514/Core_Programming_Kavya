package com.codetalksdna.Abstraction;

public class Scooty extends Vehicle {
    @Override
    void start() {
        System.out.println("My Scooty Starts with an kick");
    }

    @Override
    void tyres() {
        System.out.println("My Scooty has two Tyres");
    }
}
