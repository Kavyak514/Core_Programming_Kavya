package com.codetalksdna.Abstraction;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.tyres();
        car.fuel();

        Scooty scooty = new Scooty();
        scooty.start();
        scooty.tyres();
        scooty.fuel();

        Scooter scooter = new Scooter();
        scooter.start();
        scooter.tyres();
        scooter.fuel();

        Truck truck = new Truck();
        truck.start();
        truck.tyres();
        scooter.fuel();
    }
}
