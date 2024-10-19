package com.javalearning.threads.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            System.out.println(Thread.currentThread().getName() + " running sql query");
            Thread.sleep(100);
            return 50;
        };

        Future<Integer> future = executorService.submit(task);

        executorService.execute(() -> {
            System.out.println("This is running under execute function....");
        });

        Integer result = future.get();
        System.out.println(result);
        executorService.shutdown(); // graceful shutdown wait all task to complete it's job
        executorService.shutdownNow(); // force stop (task that are running it attempt to stop all the actively executing task)
    }
}
