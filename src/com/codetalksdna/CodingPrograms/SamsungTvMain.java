package com.codetalksdna.CodingPrograms;

public class SamsungTvMain implements TelivisionInterface {
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
        TelivisionInterface.super.changeChannelInTv();
        TelivisionInterface.super.turnOffTv();
    }

    public static void main(String[] args) {
        SamsungTvMain samsungTvMain = new SamsungTvMain();
        samsungTvMain.tvNameDisplay();
        samsungTvMain.tvConfigs();
        samsungTvMain.turnOffTv();// this prints samgung class method not telivision class method
        samsungTvMain.changeChannelInTv();
        TelivisionInterface.turnOnTv(); // as turnOnTv() is static, referencing with interface/class name and static methds cannot be overriden
    }
}
