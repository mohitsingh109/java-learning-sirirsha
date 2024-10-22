package com.javalearning.threads.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Restaurant {

    private int table;

    private final Lock lock = new ReentrantLock();

    public Restaurant(int table) {
        this.table = table;
    }

    public int getTable() {
        return table;
    }

    public void bookTable(String userName) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock.lock();
        try {
            if (table > 0) {
                table -= 1;
                System.out.println(userName + " your table is booked");
            } else {
                System.out.println(userName + " not enough table available sorry please try again after sometime");
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Restaurant inventory = new Restaurant(2);
        ExecutorService executors = Executors.newFixedThreadPool(4);
        executors.submit(() -> inventory.bookTable( "user1"));
        executors.submit(() -> inventory.bookTable("user2"));
        executors.submit(() -> inventory.bookTable( "user3"));
        executors.submit(() -> inventory.bookTable("user4"));
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

        System.out.println("Final Stock: " + inventory.getTable());
    }
}
