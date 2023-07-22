package com.codetalksdna.Abstraction;

public class Scooter implements Vehicles {
    @Override
    public void start() {
        System.out.println("Truck starts with kick itself");
    }

    @Override
    public void tyres() {
        System.out.println("It has 2 Tyres");
    }
}
