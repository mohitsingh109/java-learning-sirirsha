package com.javalearning.threads.interview;

public class Resource {

    public synchronized void method1(Resource r) { //T1,
        // T1, T2
        System.out.println(Thread.currentThread().getName() + " acquired lock on in method1");
        synchronized (r) {
            System.out.println(Thread.currentThread().getName() + " acquired lock on method2");
            r.method2();
        }
    }

    public synchronized void method2() {
        System.out.println(Thread.currentThread().getName() + " is in method2");
    }

    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.method1(r2)); // t1 lock r1 (resource) waiting for r2
        Thread t2 = new Thread(() -> r2.method1(r1)); // t2 lock r2 (resource) waiting for r1
        t1.start();
        t2.start();
    }
}
