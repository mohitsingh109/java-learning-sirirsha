package com.javalearning.designpattern.solid;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void walk();

    public abstract void sound();
}
