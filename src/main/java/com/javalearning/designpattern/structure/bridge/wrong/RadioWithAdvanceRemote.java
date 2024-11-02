package com.javalearning.designpattern.structure.bridge.wrong;

public class RadioWithAdvanceRemote extends Tv{

    public void pressPowerButton() {
        System.out.println("Advance remote power button pressed for radio.");
        turnOn();
    }

    public void mute() {
        System.out.println("Muting radio using Advance Remote.");
    }
}
