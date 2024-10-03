package com.javalearning.abstraction;

public class App {

    public static void main(String[] args) {
        Phone iPhone = new IPhone("Iphone", 2015, "12 Pro");
        Phone samsung = new Samsung("Samsung s22", 2023);
        iPhone.displayUI();
        samsung.displayUI();
        iPhone.talkingTom();
    }
}
