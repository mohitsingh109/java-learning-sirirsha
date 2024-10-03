package com.javalearning.interfaces;

public class EmailNotification implements Notification{
    @Override
    public void lowPressure() {

    }

    @Override
    public void lowFuel() {

    }

    @Override
    public String sentAlert() {
        return "Email";
    }
}
