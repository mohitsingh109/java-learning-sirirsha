package com.javalearning.designpattern.behaviourpattern.strategy.soluton;

public class BitcoinPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing the bitcoin payment of $" + amount);
    }
}
