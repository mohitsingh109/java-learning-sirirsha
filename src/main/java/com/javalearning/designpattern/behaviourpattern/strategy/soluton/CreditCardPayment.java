package com.javalearning.designpattern.behaviourpattern.strategy.soluton;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing the credit card payment of $" + amount);
    }
}
