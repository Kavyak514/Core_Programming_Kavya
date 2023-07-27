package com.codetalksdna.CodingPrograms;

public class AnimalPolymorphismMain {
    public static void main(String[] args) {
        CatAnimalPolymorphism catAnimalPolymorphism = new CatAnimalPolymorphism();
        DogAnimalPolymorphism dogAnimalPolymorphism = new DogAnimalPolymorphism();
        catAnimalPolymorphism.sound();
        dogAnimalPolymorphism.sound();
    }
}
