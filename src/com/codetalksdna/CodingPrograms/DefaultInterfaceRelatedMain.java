package com.codetalksdna.CodingPrograms;

//The class implementation of the method will be always precedence to the interface default methods
public class DefaultInterfaceRelatedMain extends DefaultInterfaceRelatedClass implements DefaultInterface1, DefaultInterface2 {
    public void printMsg() {
        System.out.println("msg printed in main");
        super.printMsg();
        DefaultInterface1.super.printMsg();
        DefaultInterface2.super.printMsg();
    }

    public static void main(String[] args) {
        DefaultInterfaceRelatedMain defaultInterfaceRelatedMain = new DefaultInterfaceRelatedMain();
        defaultInterfaceRelatedMain.printMsg();

    }
}
