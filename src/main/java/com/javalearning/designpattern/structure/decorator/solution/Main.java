package com.javalearning.designpattern.structure.decorator.solution;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -- $" + coffee.cost());

        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.getDescription() + " -- $" + coffee.cost());

        //CoffeeWithMilkAndCream
        coffee = new CreamDecorator(coffee);

        System.out.println(coffee.getDescription() + " -- $" + coffee.cost());

        // Coffee with cream
        Coffee coffee1 = new SimpleCoffee();
        coffee1 = new CreamDecorator(coffee1);
        System.out.println(coffee1.getDescription() + " -- $" + coffee1.cost());

        // Coffee with cream & caramel
        Coffee coffee2 = new SimpleCoffee();
        coffee2 = new CreamDecorator(coffee2);
        coffee2 = new CaramelDecorator(coffee2);
        System.out.println(coffee2.getDescription() + " -- $" + coffee2.cost());


        Coffee coffee3 = new SimpleCoffee();
        coffee3 = new MilkDecorator(coffee3); // coffee with milk
        coffee3 = new CaramelDecorator(coffee3);  // coffee with milk and caramel
        System.out.println(coffee3.getDescription() + " -- $" + coffee3.cost());
    }
}
