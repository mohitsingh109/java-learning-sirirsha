package com.javalearning.designpattern.behaviourpattern.observer.solution;

public class Website implements Observer{
    @Override
    public void update(double temperature, double humidity) {
        System.out.println("Notify Website: Temperature: " + temperature + " Humidity: " + humidity);
    }
}
