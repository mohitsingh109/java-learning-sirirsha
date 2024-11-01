package com.javalearning.designpattern.creational.factory.solution;

public class Truck implements Vehicle{
    @Override
    public void rent() {
        System.out.println("Renting a truck...");
    }
}
