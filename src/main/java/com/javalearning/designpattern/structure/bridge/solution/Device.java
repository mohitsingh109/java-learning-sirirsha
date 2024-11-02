package com.javalearning.designpattern.structure.bridge.solution;

public interface Device {

    void turnOn();
    void turnOff();
    void setVolume(int volume);
    boolean isOn();
}
