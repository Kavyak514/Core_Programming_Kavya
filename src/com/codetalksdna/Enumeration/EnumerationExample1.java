package com.codetalksdna.Enumeration;

enum Food {
    BIRYANI(9, 4),
    PANEER(9, 3),
    MANCHURIAN(7, 3),
    ICECREAM(8, 4),
    EGG(10, 5),
    CHICKEN(8, 3);

    final int levelOfDeliciousness;
    final int rating;

    Food(int levelOfDeliciousness, int rating) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.rating = rating;
    }
}

public class EnumerationExample1 {
    public static void main(String[] args) {
        System.out.println(Food.EGG.levelOfDeliciousness);
        System.out.println(Food.EGG.rating);
    }
}
