package com.javalearning.designpattern.behaviourpattern.strategy.soluton;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor {

    private Map<String, PaymentStrategy> paymentStrategy = new HashMap<>();

    public void addStrategy(String key, PaymentStrategy strategy) {
        paymentStrategy.put(key, strategy);
    }

    public void processingPayment(String paymentType, double amount) {
        if(!paymentStrategy.containsKey(paymentType)) { // bitcoin, creditcard, paypal, upi
            System.out.println("No payment strategy set!");
            return;
        }

        PaymentStrategy strategy = paymentStrategy.get(paymentType);
        strategy.pay(amount);
    }
}
