package com.javalearning.designpattern.structure.facade.wrong;

public class Projector {

    public void on() {
        System.out.println("Projector is on");
    }

    public void setInput(String input) {
        System.out.println("projector input set to: " + input);
    }
}
