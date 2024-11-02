package com.javalearning.designpattern.structure.bridge.wrong;

public class TvWithAdvanceRemote extends Tv{

    public void pressPowerButton() {
        System.out.println("Advance remote power button pressed for TV.");
        turnOn();
    }

    public void mute() {
        System.out.println("Muting TV using Advance Remote.");
    }
}
