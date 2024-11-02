package com.javalearning.designpattern.structure.bridge.solution;

public class Tv implements Device{

    private  boolean on = false;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Tv is now on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Tv is not off");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Tv volume set to " + this.volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
