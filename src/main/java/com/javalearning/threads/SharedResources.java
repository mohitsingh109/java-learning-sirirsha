package com.javalearning.threads;

public class SharedResources {

    private boolean isAvailable = false;

    //produce()
    public synchronized void produce() throws InterruptedException {
        while (isAvailable) {
            wait(); // wait until the resource is consumed
        }

        System.out.println("Produced resource");
        isAvailable = true;
        notify(); // Notify the consumer thread
    }

    //consume()
    public synchronized void consume() throws InterruptedException {
        while (!isAvailable) {
            wait(); // wait until the resource is produced
        }
        System.out.println("Consume resource");
        isAvailable = false;
        notify(); // Notify the produce thread
    }
}
