package com.javalearning.designpattern.behaviourpattern.strategy.soluton;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("UPI payment for $" + amount);
    }
}
