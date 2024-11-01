package com.javalearning.designpattern.creational.builder.wrong;

public class Pizza {

    private String size;

    private boolean extraCheese;

    private boolean pepperoni;

    private boolean mushrooms;

    private boolean paneer;

    private boolean olives;

    private boolean chilly;

    public Pizza(String size, boolean extraCheese, boolean pepperoni, boolean mushrooms, boolean paneer, boolean olives, boolean chilly) {
        this.size = size;
        this.extraCheese = extraCheese;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
        this.paneer = paneer;
        this.olives = olives;
        this.chilly = chilly;
    }

    public Pizza(String size, boolean extraCheese) {
        this.size = size;
        this.extraCheese = extraCheese;
    }

    public Pizza(String size, boolean pepperoni, boolean mushrooms) {
        this.size = size;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
    }

    public Pizza(String size, boolean extraCheese, boolean pepperoni, boolean mushrooms) {
        this.size = size;
        this.extraCheese = extraCheese;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
    }



}
