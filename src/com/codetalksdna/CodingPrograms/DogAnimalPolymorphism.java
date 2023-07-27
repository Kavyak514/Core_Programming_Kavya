package com.codetalksdna.CodingPrograms;

public class DogAnimalPolymorphism extends AnimalPolymorphism{
    @Override
    public void sound() {
        System.out.println("dog make barking sound");
        super.sound();
        System.out.println();
    }
}
