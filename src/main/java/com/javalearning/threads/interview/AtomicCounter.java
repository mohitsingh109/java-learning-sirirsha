package com.javalearning.threads.interview;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private AtomicInteger count = new AtomicInteger();

    public void increment() {
        count.incrementAndGet(); // thread safe
    }

    public int getCount() {
        return count.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicCounter atomicCounter = new AtomicCounter();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                atomicCounter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                atomicCounter.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join(); // wait for thread to complete
        t2.join(); // wait for thread to complete
        System.out.println(atomicCounter.getCount());
    }
}
