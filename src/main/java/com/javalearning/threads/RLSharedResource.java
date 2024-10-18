package com.javalearning.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RLSharedResource {
    private final Lock lock = new ReentrantLock();
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public void doTask() {
        System.out.println(Thread.currentThread().getName() + " Independent Code...");
        //Code start
        lock.lock();//T0  Waiting for lock the resource: [T1, T2, ....]
        try {
            System.out.println(Thread.currentThread().getName() + " is executing");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(Thread.currentThread().getName() + " Unlock");
            lock.unlock(); // Releasing the lock
        }
        //Code end
    }

    public void task1() {
        lock1.lock();
        System.out.println(Thread.currentThread().getName() + " lock the task1 function");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " unlock task 1");
        lock1.unlock();
    }

    public void task3() {
        lock1.lock();
        System.out.println(Thread.currentThread().getName() + " lock the task3 function");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " unlock task 3");
        lock1.unlock();
    }

    public void task2() {
        lock2.lock();
        System.out.println(Thread.currentThread().getName() + " lock the task2 function");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        lock2.unlock();
    }

    public static void main(String[] args) {
        RLSharedResource resource = new RLSharedResource();
        Thread thread1 = new Thread(() -> resource.task1());
        Thread thread2 = new Thread(() -> resource.task2());
        Thread thread3 =new Thread(() -> resource.task3());
        thread3.setPriority(Thread.MAX_PRIORITY); // 1 to 10
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
