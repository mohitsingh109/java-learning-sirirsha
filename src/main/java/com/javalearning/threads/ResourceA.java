package com.javalearning.threads;

public class ResourceA {

    public synchronized void methodA(ResourceB b) {
        System.out.println("Thread 1: Locked Resource A");
        try {
            Thread.sleep(1000); // Block for 1s
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b.methodB(); // request for resource b to lock
    }

    public synchronized void methodB() {
        System.out.println("Inside Resource A's methodB");
    }
}
