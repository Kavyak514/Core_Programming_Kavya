package com.codetalksdna.CodingPrograms;

public class CarVehiclePolymorphism  extends VehiclePolymorphism{
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Car speed is+ "+super.getSpeed());
    }
}
