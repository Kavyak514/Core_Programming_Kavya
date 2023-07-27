package com.codetalksdna.CodingPrograms;

public class Rectangle extends Shape{
    private double length;
    private double width;

    /*(double length, double width){
        this.length = length;
        this.width = width;
    }*/

    @Override
    public void getArea() {
        double areaOfRectangle = getLength() * getWidth();
        System.out.println("Area of the rectangle is: "+areaOfRectangle);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
