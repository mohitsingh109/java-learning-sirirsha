package com.javalearning.designpattern.behaviourpattern.observer.solution;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observers = new ArrayList<>();

    private double temperature;

    private double humidity;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) { // list user
            observer.update(temperature, humidity);
        }
    }

    public void setWeatherData(double temperature, double humidity) {
        this.humidity = humidity;
        this.temperature = temperature;

        notifyObserver(); // it will inform all the user
    }
}
