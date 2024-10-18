package com.javalearning.threads;

public class DeadLockApp {
    public static void main(String[] args) {
        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();

        Thread thread1 = new Thread(() -> a.methodA(b));
        Thread thread2 = new Thread(() -> b.methodA(a));
        thread1.start();
        thread2.start();
    }
}
