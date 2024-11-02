package com.javalearning.designpattern.structure.bridge.wrong;

public class RadioWithBasicRemote extends Radio{

    public void pressPowerButton() {
        System.out.println("Basic remote power button pressed for radio.");
        turnOn();
    }
}
