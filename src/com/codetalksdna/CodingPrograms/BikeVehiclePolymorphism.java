package com.codetalksdna.CodingPrograms;

public class BikeVehiclePolymorphism extends VehiclePolymorphism{
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Bike speed is+ "+super.getSpeed());
    }
}
