package com.javalearning.designpattern.structure.decorator.solution;

public class MilkDecorator extends CoffeeDecorator{ // Milk Paint
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }
}
