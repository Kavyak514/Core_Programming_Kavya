package com.codetalksdna;

public class ParentClass extends ChildClass {
    @Override
    protected void welcome() {
        super.welcome();
    }

    public void testCase(){
        welcome();
    }
}
