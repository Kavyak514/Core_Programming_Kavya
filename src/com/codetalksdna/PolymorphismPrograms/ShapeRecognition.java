package com.codetalksdna.PolymorphismPrograms;

public class ShapeRecognition implements ShapeCase {

    @Override
    public void shape(int side) {
        System.out.println("The Area of the Square is" + " " + (side * side));
    }

    public void defaultShapeValue(int side, int length) {
        System.out.println("Welcome to Java1");
    }

    public void defaultShapeValue2(int side, int length) {
        ShapeCase.super.defaultShapeValue(20, 10);
    }

    public static void main(String[] args) {
        ShapeRecognition shapeRecognition = new ShapeRecognition();
        shapeRecognition.shape(20);
        ShapeCase.defaultStaticValue(20, 30);
        shapeRecognition.defaultShapeValue(20, 20);
        shapeRecognition.defaultShapeValue2(20, 20);
    }
}
