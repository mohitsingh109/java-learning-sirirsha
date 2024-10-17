package com.javalearning.threads;

public class SharedResourcesApp {
    public static void main(String[] args) {
        SharedResources sharedResources = new SharedResources();

        Thread produce = new Thread(() -> {
            try {
                sharedResources.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread produce1 = new Thread(() -> {
            try {
                sharedResources.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread produce2 = new Thread(() -> {
            try {
                sharedResources.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consume = new Thread(() -> {
            try {
                sharedResources.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consume1 = new Thread(() -> {
            try {
                sharedResources.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consume2 = new Thread(() -> {
            try {
                sharedResources.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        produce.start();
        produce1.start();
        produce2.start();

        consume.start();
        consume1.start();
        consume2.start();
    }
}
