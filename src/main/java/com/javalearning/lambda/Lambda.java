package com.javalearning.lambda;

public class Lambda {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in thread");
                System.out.println("Running in happy thread");
            }
        };

        Runnable runnable1 = () ->  System.out.println("Running in thread");

        Runnable runnable2 = () ->  {
            System.out.println("Running in thread");
            System.out.println("Running in happy thread");
        };
        // Lambda
        // (parameters) -> expression
        // (parameters) -> { statements; }

        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.add(10, 20));
    }
}

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
