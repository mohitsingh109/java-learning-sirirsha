package com.javalearning.designpattern.behaviourpattern.strategy.soluton;

public class PaypalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing the paypal payment of $" + amount);
    }
}
