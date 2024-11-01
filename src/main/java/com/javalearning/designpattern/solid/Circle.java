package com.javalearning.designpattern.solid;

public class Circle implements Shape{

    private double radius;

    @Override
    public double calculateArea() {
        return radius;
    }
}
