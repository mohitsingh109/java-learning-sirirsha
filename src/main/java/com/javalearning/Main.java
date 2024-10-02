package com.javalearning;

import com.javalearning.methodandfunction.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setName("C1");
        calculator.add(10, 20);
        calculator.add(10.3f, 10.6f);
        calculator.add(10L, 33L);

        System.out.println(10);
        System.out.println(10.5);
        System.out.println("sfhsdkf");

        Math.max(10, 20);
        Math.max(10.5, 20.5);
    }
}