package com.javalearning.designpattern.structure.bridge.wrong;

public class Tv extends Device{
    @Override
    public void turnOn() {
        System.out.println("Turning on the TV.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting the volume to " + volume);
    }
}
