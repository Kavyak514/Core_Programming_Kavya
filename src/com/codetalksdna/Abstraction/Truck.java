package com.codetalksdna.Abstraction;

public class Truck implements Vehicles{
    @Override
    public void start() {
        System.out.println("Truck starts with ignition itself");
    }

    @Override
    public void tyres() {
        System.out.println("It has 16 Tyres");
    }
}
