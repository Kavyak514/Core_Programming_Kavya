package com.codetalksdna.CodingPrograms;

import java.util.Scanner;

public class CircleEncapsulationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius");
        double radius = scanner.nextDouble();

        CircleEncapsulation circleEncapsulation = new CircleEncapsulation(radius);

        System.out.println("Circle area is " + Math.round(circleEncapsulation.calculateArea())
                + " and perimeter is " + Math.round(circleEncapsulation.calculatePerimeter()));
    }
}
