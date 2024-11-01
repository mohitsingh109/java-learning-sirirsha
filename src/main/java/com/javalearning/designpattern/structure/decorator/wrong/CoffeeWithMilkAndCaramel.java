package com.javalearning.designpattern.structure.decorator.wrong;

// a subclass for coffee with milk
public class CoffeeWithMilkAndCaramel extends CoffeeWithMilk{

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 1.0; // 6
    }
}
