package com.codetalksdna.CodingPrograms;

public interface DefaultInterface1 {
    default void printMsg(){
        System.out.println("Msg printed in interface 1");
    }
}
