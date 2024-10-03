package com.javalearning.abstraction;

public class Samsung extends Phone{

    public Samsung(String name, int year) {
        super(name, year);
    }

    @Override
    public void displayUI() {
        System.out.println("Samsung UI");
    }

    @Override
    public void captureImage() {
        System.out.println("Samsung click image");
    }
}
