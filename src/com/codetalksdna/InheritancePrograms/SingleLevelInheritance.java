package com.codetalksdna.InheritancePrograms;

class Parent1 {
    public void welcome() {
        System.out.println("I am from Parent1 Class");
    }
}

class Child1 extends Parent1 {
    @Override
    public void welcome() {
        super.welcome();
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.welcome();
    }
}