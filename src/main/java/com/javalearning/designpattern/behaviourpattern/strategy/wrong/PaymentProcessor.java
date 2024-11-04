package com.javalearning.designpattern.behaviourpattern.strategy.wrong;

public class PaymentProcessor {

    public void processPayment(String paymentType, double price) {
        if(paymentType.equals("creditcard")) {
            System.out.println("Processing credit card payment of $" + price);
        } else if (paymentType.equals("bitcoin")) {
            System.out.println("Processing Paypal payment of $" + price);
        } else if (paymentType.equals("paypal")) {
            System.out.println("Processing Bitcoin payment of $" + price);
        } else if(paymentType.equals("upi")) {
            System.out.println("Processing UPI payment of $" + price);
        } else {
            System.out.println("Invalid payment type: " + paymentType);
        }
    }
}
