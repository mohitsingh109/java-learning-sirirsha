package com.javalearning.threads;

public class Task extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" Thread Started"); // Block I/O
    }
}
