package com.javalearning.designpattern.creational.builder.solution;

public class Main {

    public static void main(String[] args) {
        Pizza large = new Pizza.Builder("Large")
                .addExtraCheese() // return the builder object
                .addMushrooms() // return the builder object
                .build(); // --> to create a final object for you

        System.out.println(large);
        Pizza medium = new Pizza.Builder("Medium")
                .addExtraCheese()
                .addPaneer()
                .addOlive()
                .build();
        System.out.println(medium);
        Pizza regular = new Pizza.Builder("Regular")
                .addExtraCheese()
                .addMushrooms()
                .addPaneer()
                .addOlive()
                .addPepperoni()
                .build();
        System.out.println(regular);
        Pizza large1 = new Pizza.Builder("Large")
                .addMushrooms()
                .addPepperoni()
                .build();
        System.out.println(large1);
    }
}
