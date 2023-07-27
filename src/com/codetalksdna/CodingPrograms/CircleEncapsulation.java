package com.codetalksdna.CodingPrograms;

public class CircleEncapsulation {
    private double radius;

    public double getRadius() {
        return radius;
    }

    CircleEncapsulation(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        double area = 0.0;
        if(radius >= 0){
            area = Math.PI * radius * radius;
        }
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 0.0;
        if(radius >= 0){
            perimeter = 2 * Math.PI * radius;
        }
        return perimeter;
    }
}
