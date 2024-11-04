package com.javalearning.designpattern.behaviourpattern.observer.solution;

public class LedDisplay implements Observer {
    @Override
    public void update(double temperature, double humidity) {
        System.out.println("Notify Led Display: Temperature: " + temperature + " Humidity: " + humidity);
    }
}
