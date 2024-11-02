package com.javalearning.designpattern.structure.bridge.solution;

public class AdvanceRemote extends Remote{
    public AdvanceRemote(Device device) {
        super(device);
    }

    public void pressPowerButton() {
        System.out.println("Advance Remote: Power button pressed.");
        power();
    }

    public void mute() {
        System.out.println("Advance Remote: Muting device");
        device.setVolume(0);
    }
}
