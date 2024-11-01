package com.javalearning.designpattern.creational.factory.solution;

public class Bike implements Vehicle{
    @Override
    public void rent() {
        System.out.println("Renting a bike...");
    }
}
