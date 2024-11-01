package com.javalearning.designpattern.creational;

//Lazy Initialization + Thread Safe
public class DatabaseConnectionManagerLazy {

    // This object is created once
    //class variable
    private static DatabaseConnectionManagerLazy instance;  // null

    private DatabaseConnectionManagerLazy() {}

    //class function
    public static DatabaseConnectionManagerLazy getInstance() { // T3

        if(instance == null) {  // Not Thread safe
            synchronized (DatabaseConnectionManagerLazy.class) { //T1 //T2 ...T100
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(instance == null) {  // Not Thread safe
                    System.out.println("Inside the object creation of singleton pattern"); //T1
                    instance = new DatabaseConnectionManagerLazy();
                }
            }
        }
        return instance;
    }

}


// new DatabaseConnectionManager() //