package com.javalearning.threads;

public class TaskRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" Thread started in Runnable");
    }
}
