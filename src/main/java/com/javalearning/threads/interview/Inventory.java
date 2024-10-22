package com.javalearning.threads.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Inventory {

    private int stock;

    private final Lock lock = new ReentrantLock();

    public Inventory(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity, String userName) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock.lock();
        try {
            if(stock >= quantity) {
                stock -= quantity;
                System.out.println( userName + " Stock reduced by " + quantity +" Remaining Stock: " + stock);
            } else {
                System.out.println("Not enough stock available");
            }
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Inventory inventory = new Inventory(10);
        ExecutorService executors = Executors.newFixedThreadPool(4);
        executors.submit(() -> inventory.reduceStock(5, "user1"));
        executors.submit(() -> inventory.reduceStock(3, "user2"));
        executors.submit(() -> inventory.reduceStock(1, "user3"));
        executors.submit(() -> inventory.reduceStock(3, "user4"));
        executors.shutdown();
//        Thread user1 = new Thread(() -> inventory.reduceStock(5, "user1"));
//        Thread user2 = new Thread(() -> inventory.reduceStock(3, "user2"));
//        Thread user3 = new Thread(() -> inventory.reduceStock(1, "user3"));
//        Thread user4 = new Thread(() -> inventory.reduceStock(3, "user4"));
//        user1.start();
//        user2.start();
//        user3.start();
//        user4.start();
//
//        user1.join();
//        user2.join();
//        user3.join();
//        user4.join();

        System.out.println("Final Stock: " + inventory.getStock());
    }
}
