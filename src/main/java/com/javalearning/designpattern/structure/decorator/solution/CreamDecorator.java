package com.javalearning.designpattern.structure.decorator.solution;

public class CreamDecorator extends CoffeeDecorator{
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Creme";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.5;
    }
}
