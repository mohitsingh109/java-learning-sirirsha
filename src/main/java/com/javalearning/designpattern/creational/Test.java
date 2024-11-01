package com.javalearning.designpattern.creational;

public class Test {

    public static void main(String[] args) throws InterruptedException {
//        DatabaseConnectionManagerLazy lazy = DatabaseConnectionManagerLazy.getInstance();
//        DatabaseConnectionManagerLazy lazy1 = DatabaseConnectionManagerLazy.getInstance();
//        DatabaseConnectionManagerLazy lazy2 = DatabaseConnectionManagerLazy.getInstance();

        Thread t1 = new Thread(() -> DatabaseConnectionManagerLazy.getInstance());
        Thread t2 = new Thread(() -> DatabaseConnectionManagerLazy.getInstance());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
