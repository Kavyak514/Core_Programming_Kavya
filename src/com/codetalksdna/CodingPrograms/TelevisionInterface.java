package com.codetalksdna.CodingPrograms;

public interface TelevisionInterface {
    void tvNameDisplay();
    void tvConfigs();
    default void turnOffTv(){
        System.out.println("Click the power button in tv to turn it off,TV is turned off");
    }

    static void turnOnTv(){
        System.out.println("Click the power button in tv to turn it on, Tv is on");
    }

    default void changeChannelInTv(){
        System.out.println("Channel changed");
    }
}
