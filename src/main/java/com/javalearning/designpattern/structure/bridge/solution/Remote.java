package com.javalearning.designpattern.structure.bridge.solution;

public abstract class Remote {

    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void power() {
        if(device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}
