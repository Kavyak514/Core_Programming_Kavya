package com.codetalksdna.Abstraction;

public interface Vehicles {
    void start();

    void tyres();

    default void fuel() {
        System.out.println("Every Vehicle runs on Fuel");
    }
}
