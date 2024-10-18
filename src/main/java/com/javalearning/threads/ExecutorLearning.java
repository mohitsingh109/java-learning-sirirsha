package com.javalearning.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorLearning {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(200);
//        executorService.submit(() -> {
//            System.out.println("Running sql on table1");
//        });
//        executorService.submit(() -> {
//            System.out.println("Running sql on table2");
//        });
//        executorService.submit(() -> {
//            System.out.println("Running sql on table3");
//        });
//        executorService.submit(() -> {
//            System.out.println("Running sql on table4");
//        });
//        executorService.submit(() -> {
//            System.out.println("Running sql on table5");
//        });
//        for(int i = 0; i < 50; i++) {
//            int finalI = i;
//            executorService.submit(() -> {
//                System.out.println(Thread.currentThread().getName()+ " is executing task: " + finalI);
//            });
//        }
//        executorService.shutdown();

//        ExecutorService cacheExecutor = Executors.newCachedThreadPool();
//        List<String> threadName = new ArrayList<>();
//        for (int i = 0; i < 100000; i++) {
//            int finalI = i;
//            cacheExecutor.submit(() -> {
//                threadName.add(Thread.currentThread().getName());
//                System.out.println(Thread.currentThread().getName() + " is executing task: " + finalI);
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//        }
//        cacheExecutor.shutdown();
//        Collections.sort(threadName, Comparator.reverseOrder());
//        for (String t: threadName)
//            System.out.println(t);


//        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
//
//        singleExecutor.submit(() -> System.out.println("clean otp table data"));
//        singleExecutor.submit(() -> System.out.println("clean logs table data"));
//        singleExecutor.submit(() -> System.out.println("clean analytics table data"));
//
//        singleExecutor.shutdown();
//        List<String> task = new ArrayList<>(); // data table

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        scheduledExecutorService.schedule(() -> {
            System.out.println(Thread.currentThread().getName() + " is executing dashboard report generation");
        }, 5, TimeUnit.SECONDS);

        scheduledExecutorService.schedule(() -> {
            System.out.println(Thread.currentThread().getName() + " is executing retry sms/email");
        }, 30, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println(Thread.currentThread().getName() + " is executing schedule task for csv generation");
        },1, 3, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000 * 6); // 1m 10s
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        scheduledExecutorService.shutdown();
    }
}
