package com.codetalksdna.CodingPrograms;

//The class implementation of the method will be always precedence to the interface default methods
public class DefaultInterfaceMain2 implements DefaultInterface1 {
    public void printMsg() {
        System.out.println("main 2 msg");
        DefaultInterface1.super.printMsg();
    }

    public static void main(String[] args) {
        DefaultInterfaceMain2 defaultInterfaceRelatedMain = new DefaultInterfaceMain2();
        defaultInterfaceRelatedMain.printMsg();
    }
}
