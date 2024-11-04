package com.javalearning.designpattern.behaviourpattern.strategy.wrong;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("creditcard", 50.0);
        processor.processPayment("paypal", 75);
        processor.processPayment("bitcoin", 100);
    }
}
