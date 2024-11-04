package com.javalearning.designpattern.behaviourpattern.observer.solution;

public class MobileApp implements Observer{
    @Override
    public void update(double temperature, double humidity) {
        System.out.println("Notify Mobile App: Temperature: " + temperature + " Humidity: " + humidity);
    }
}
