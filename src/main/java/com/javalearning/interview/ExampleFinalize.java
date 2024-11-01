package com.javalearning.interview;

public class ExampleFinalize {

    public static void main(String[] args) {
        ExampleFinalize exampleFinalize = new ExampleFinalize();
        exampleFinalize = null;
        System.gc(); // it's a request to JVM
        System.out.println("exampleFinalize is destroyed");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Inside finalize method");
    }
}
