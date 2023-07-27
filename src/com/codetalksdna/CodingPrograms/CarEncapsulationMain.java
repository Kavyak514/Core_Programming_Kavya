package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class CarEncapsulationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter car mileage");
        int mileage = scanner.nextInt();
        if(mileage < 0) {
            System.out.println("Please enter car mileage > 0 and rerun");
            return;
        }
        CarEncapsulation carEncapsulation = new CarEncapsulation(mileage);
        carEncapsulation.setYear(2022);
        carEncapsulation.setCompany_name("Honda");
        carEncapsulation.setModel_name("SUV");

        System.out.println("Car details are:");
        System.out.println(carEncapsulation.getCompany_name() + ", " + carEncapsulation.getModel_name() + ", " +
                 carEncapsulation.getYear()+ ", "+carEncapsulation.getMileage());
    }
}
