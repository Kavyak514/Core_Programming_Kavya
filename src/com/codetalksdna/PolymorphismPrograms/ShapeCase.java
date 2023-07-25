package com.codetalksdna.PolymorphismPrograms;

public interface ShapeCase {
    void shape(int side);

    static void defaultStaticValue(int side, int length) {
        System.out.println("Welcome to Java");
    }
    default void defaultShapeValue(int side, int length) {
        System.out.println("Welcome to Java");
    }
}
