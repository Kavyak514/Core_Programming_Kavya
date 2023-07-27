package com.codetalksdna.InheritancePrograms;

class Parent2 {
    public void welcome() {
        System.out.println("I am from Parent2 Class");
    }
}

class Child2 extends Parent2 {
    public void welcome() {
        System.out.println("I am from Child2 Class");
    }
}

class Child3 extends Child2 {

}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child3 child3 = new Child3();
        child3.welcome();
    }
}

