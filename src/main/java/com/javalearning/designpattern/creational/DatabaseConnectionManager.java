package com.javalearning.designpattern.creational;

//Eager Initialization
public class DatabaseConnectionManager {

    // This object is created once
    //class variable
    private static final DatabaseConnectionManager instance = new DatabaseConnectionManager();  // 30s

    private DatabaseConnectionManager() {}

    //class function
    public static DatabaseConnectionManager getInstance() {
        return instance;
    }

}


// new DatabaseConnectionManager() //