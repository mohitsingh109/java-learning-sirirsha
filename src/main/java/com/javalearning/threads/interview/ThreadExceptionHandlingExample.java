package com.javalearning.threads.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExceptionHandlingExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            System.out.println(Thread.currentThread().getName()+ "is executing");
            throw new RuntimeException("task failed");
        };

        Future<Integer> future = executorService.submit(task);
        try {
            Integer i = future.get(); // exception
        }finally {
            executorService.shutdown(); // memory loss, zombie thread, dangling pointer
        }

    }
}
