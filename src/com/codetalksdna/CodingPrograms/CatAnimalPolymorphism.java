package com.codetalksdna.CodingPrograms;

public class CatAnimalPolymorphism extends AnimalPolymorphism{
    @Override
    public void sound() {
        System.out.println("Cat makes meows sound");
        super.sound();
        System.out.println();
    }
}
