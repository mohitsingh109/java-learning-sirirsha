package com.javalearning.designpattern.structure.bridge.solution;

public class Radio implements Device{

    private  boolean on = false;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is now on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is not off");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + this.volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
