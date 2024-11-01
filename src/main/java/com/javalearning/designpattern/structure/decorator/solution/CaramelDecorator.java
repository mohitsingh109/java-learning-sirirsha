package com.javalearning.designpattern.structure.decorator.solution;

public class CaramelDecorator extends  CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Caramel";
    }

    @Override
    public double cost() {
        return coffee.cost() + 2.0;
    }
}
