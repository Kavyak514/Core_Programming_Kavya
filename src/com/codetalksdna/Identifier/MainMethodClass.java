package com.codetalksdna.Identifier;

class ChildClass {
    protected void welcome() {
        System.out.println("welcome to protected method");
    }
}

class ParentClass extends ChildClass {
    @Override
    protected void welcome() {
        super.welcome();
    }

    public void testCase() {
        welcome();
    }
}

public class MainMethodClass {
    public static void main(String[] args) {
        ParentClass test = new ParentClass();
        test.testCase();
    }
}

