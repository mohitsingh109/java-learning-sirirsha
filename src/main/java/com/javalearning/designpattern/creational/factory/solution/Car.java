package com.javalearning.designpattern.creational.factory.solution;

public class Car implements Vehicle{
    @Override
    public void rent() {
        System.out.println("Renting a car...");
    }
}
