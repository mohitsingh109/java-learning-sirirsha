package com.javalearning.threads;

public class ResourceB {

    public synchronized void methodA(ResourceA a) {
        System.out.println("Thread 2: Locked Resource B");
        try {
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        a.methodB(); // Request to lock Resource A
    }

    public synchronized void methodB() {
        System.out.println("Inside Resource B's methodB");
    }
}
