package com.codetalksdna.Collections;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);
        integerStack.push(50);
        integerStack.push(60);

        System.out.println(integerStack.pop());
        System.out.println(integerStack.peek());
        System.out.println(integerStack.search(40));
        System.out.println(integerStack);
    }
}
