package com.codetalksdna.InheritancePrograms;

class Parent3 {
    public void welcome() {
        System.out.println("Welcome to Java");
    }
}

class Child4 extends Parent3 {
    public void welcome() {
        System.out.println("Welcome to Java");
    }
}

class Child5 extends Parent3 {
    public void welcome() {
        System.out.println("Welcome to Java1");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Child5 child5 = new Child5();
        child5.welcome();
    }
}
