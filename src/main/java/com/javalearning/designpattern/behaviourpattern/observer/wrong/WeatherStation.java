package com.javalearning.designpattern.behaviourpattern.observer.wrong;

public class WeatherStation {

    private double temperature;

    private double humidity;

    public void setWeatherData(double temperature, double humidity) {
        this.humidity = humidity;
        this.temperature = temperature;

        notifyMobileApp();
        notifyWebsite();
        notifyLedDisplay();
    }

    private void notifyLedDisplay() {
        System.out.println("Notify Led Display: Temperature: " + temperature + " Humidity: " + humidity);
    }

    private void notifyWebsite() {
        System.out.println("Notify Website: Temperature: " + temperature + " Humidity: " + humidity);

    }

    private void notifyMobileApp() {
        System.out.println("Notify Mobile App: Temperature: " + temperature + " Humidity: " + humidity);

    }
}
