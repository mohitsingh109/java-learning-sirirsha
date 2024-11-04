package com.javalearning.designpattern.behaviourpattern.observer.solution;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation  = new WeatherStation();

        Observer mobilApp = new MobileApp();
        Observer website = new Website();
        Observer ledDisplay = new LedDisplay();

        weatherStation.registerObserver(mobilApp);
        weatherStation.registerObserver(website);
        weatherStation.registerObserver(ledDisplay);

        // update
        weatherStation.setWeatherData(25.5, 65.0);

        weatherStation.setWeatherData(28.5, 70.0);
    }
}
