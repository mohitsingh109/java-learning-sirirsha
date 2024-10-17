package com.javalearning.threads;

public class App {
    public static void main(String[] args) {
//        Task task = new Task(); //Thread-0 // New
//        task.start(); // Runnable --> Running
//        // Terminated
//
//        Task task1 = new Task(); // Thread-1
//        task1.start();
//
//        TaskRunnable taskRunnable = new TaskRunnable();
//        Thread thread = new Thread(taskRunnable); // Thread-2
//        thread.start();

        Restaurant restaurant = new Restaurant();
        Restaurant restaurant2 = new Restaurant();

        Thread chef1 = new Thread(() -> restaurant.cook1("chef1"));
        Thread chef2 = new Thread(() -> restaurant.cook1("chef2"));
        Thread chef3 = new Thread(() -> restaurant.cook1("chef3"));

        chef1.start();
        chef2.start();
        chef3.start();
        //restaurant2.cook("Chef2345");

        Thread serve1 = new Thread(() -> Restaurant.serve1(chef1, "serve1"));
        Thread serve2 = new Thread(() -> Restaurant.serve1(chef2, "serve2"));
        Thread serve3 = new Thread(() -> Restaurant.serve1(chef3, "serve3"));
        serve1.start();
        serve2.start();
        serve3.start();
    }
}
