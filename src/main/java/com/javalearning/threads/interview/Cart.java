package com.javalearning.threads.interview;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cart {
    private int itemInCart;
    public final Lock lock = new ReentrantLock();

    public Cart(int itemInCart) {
        this.itemInCart = itemInCart;
    }

    public int getItemInCart() {
        return itemInCart;
    }

    public void addItem(int quantity, int stockAvailable) {
        lock.lock();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            if(quantity <= stockAvailable) {
                itemInCart += quantity;
                System.out.println(quantity + " items added to the cart. Total items: " + itemInCart);
            } else {
                System.out.println("Not enough stock available");
            }
        }finally {
            lock.unlock();
        }
    }

    public void removeItem(int quantity) {
        lock.lock();
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            if(itemInCart >= quantity) {
                itemInCart -= quantity;
                System.out.println(quantity + " items removed from the cart. Total items: " + itemInCart);
            } else {
                System.out.println("Cannot remove more items in cart");
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Cart cart = new Cart(10);
        int stockAvailable = 50;
        Thread t1 = new Thread(() -> cart.addItem(10, stockAvailable));
        Thread t2 = new Thread(() -> cart.removeItem(10));
        Thread t3 = new Thread(() -> cart.removeItem(3));
        Thread t4 = new Thread(() -> cart.removeItem(30));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Final item in cart " + cart.getItemInCart());
    }
}
