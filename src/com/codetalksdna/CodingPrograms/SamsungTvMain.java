package com.codetalksdna.CodingPrograms;

public class SamsungTvMain implements TelevisionInterface {
    @Override
    public void tvNameDisplay() {
        System.out.println("Tv Company is samsung");
    }

    @Override
    public void tvConfigs() {
        System.out.println("Tv has configs");
    }

    @Override
    public void turnOffTv() {
        System.out.println("Samsung tv is turned off");
    }

    @Override
    public void changeChannelInTv() {
        TelevisionInterface.super.changeChannelInTv();
        TelevisionInterface.super.turnOffTv();
    }

    public static void main(String[] args) {
        SamsungTvMain samsungTvMain = new SamsungTvMain();
        samsungTvMain.tvNameDisplay();
        samsungTvMain.tvConfigs();
        samsungTvMain.turnOffTv();// this prints samsung class method not television class method
        samsungTvMain.changeChannelInTv();
        TelevisionInterface.turnOnTv(); // as turnOnTv() is static, referencing with interface/class name and static methods cannot be overridden.
    }
}
