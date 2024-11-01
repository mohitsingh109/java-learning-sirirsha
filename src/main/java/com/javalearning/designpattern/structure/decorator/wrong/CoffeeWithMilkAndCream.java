package com.javalearning.designpattern.structure.decorator.wrong;

public class CoffeeWithMilkAndCream extends CoffeeWithMilk{

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }
}
