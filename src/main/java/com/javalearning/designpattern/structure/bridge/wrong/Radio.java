package com.javalearning.designpattern.structure.bridge.wrong;

public class Radio extends Device{
    @Override
    public void turnOn() {
        System.out.println("Turning on the radio.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the radio.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Setting Radio volume to " + volume);
    }
}
