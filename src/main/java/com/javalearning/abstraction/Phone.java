package com.javalearning.abstraction;

public abstract class Phone {

    private String name;

    private int year;

    private Ram ram; // has a relationship

    public Phone(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public abstract void displayUI();

    public abstract void captureImage();

    public void flashLight() {
        System.out.println("Switch on flash light");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void talkingTom() {
        System.out.println("Latest tom");
    }
}
