package com.javalearning.designpattern.structure.bridge.solution;

public class BasicRemote extends Remote{
    public BasicRemote(Device device) {
        super(device);
    }

    public void pressPowerButton() {
        System.out.println("Basic Remote: Power button pressed.");
        power();
    }
}
