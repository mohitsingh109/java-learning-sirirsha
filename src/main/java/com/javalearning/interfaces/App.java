package com.javalearning.interfaces;

public class App {

    public static void main(String[] args) {
        Notification notification = new SmsNotification();
        notification.lowFuel();
        notification.lowPressure();
    }
}
