package com.javalearning.interfaces;

public class SmsNotification implements Notification{

    @Override
    public void lowPressure() {
        System.out.println("SMS low Pressure");
    }

    @Override
    public void lowFuel() {
        System.out.println("SMS low fuel");
    }

    @Override
    public String sentAlert() {
        return "SMS";
    }
}
