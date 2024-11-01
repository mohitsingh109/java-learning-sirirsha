package com.javalearning.designpattern.creational.builder.solution;

public class Pizza {

    private String size;

    private boolean extraCheese;

    private boolean pepperoni;

    private boolean mushrooms;

    private boolean paneer;

    private boolean olives;

    private boolean chilly;

    private Pizza(Builder builder) { // --> Builder object
        this.size = builder.size;
        this.extraCheese = builder.extraCheese;
        this.olives = builder.olives;
        this.paneer = builder.paneer;
        this.mushrooms = builder.mushrooms;
        this.chilly = builder.chilly;
        this.pepperoni = builder.pepperoni;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", extraCheese=" + extraCheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                ", paneer=" + paneer +
                ", olives=" + olives +
                ", chilly=" + chilly +
                '}';
    }

    // builder class
    // inner class

    public static class Builder {

        // required field
        private String size;


        // optional properties
        private boolean extraCheese = false;

        private boolean pepperoni = false;

        private boolean mushrooms = false;

        private boolean paneer = false;

        private boolean olives = false;

        private boolean chilly = false;


        public Builder(String size) {
            this.size = size;
        }

        public Builder addExtraCheese() {
            this.extraCheese = true;
            return this; // --> builder the object
        }

        public Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        public Builder addPaneer() {
            this.paneer = true;
            return this;
        }

        public Builder addOlive() {
            this.olives = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

}
