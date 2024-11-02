package com.javalearning.designpattern.structure.bridge.wrong;

public class TvWithBasicRemote extends Tv{

    public void pressPowerButton() {
        System.out.println("Basic remote power button pressed for TV.");
        turnOn();
    }
}
