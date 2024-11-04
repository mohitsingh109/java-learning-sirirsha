package com.javalearning.designpattern.behaviourpattern.strategy.soluton;

public class Main {

    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy bitcoin = new BitcoinPayment();
        PaymentStrategy paypal = new PaypalPayment();
        PaymentStrategy upi = new UPIPayment();

        PaymentProcessor processor = new PaymentProcessor();
        processor.addStrategy("creditcard", creditCard);
        processor.addStrategy("bitcoin", bitcoin);
        processor.addStrategy("paypal", paypal);
        processor.addStrategy("upi", upi);

        processor.processingPayment("bitcoin", 100);
        processor.processingPayment("upi", 100);
        processor.processingPayment("paypal",100);
        processor.processingPayment("creditcard",100);
    }
}
