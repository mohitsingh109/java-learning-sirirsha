package com.javalearning.methodandfunction;

//AM [public, default]
public class Calculator {

    private String name; // Data member, Object variable

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // add two int
    public int add(int a, int b) {
        return a + b;
    }

    // add three int

    // add two float
    public float add(float a, float b) {
        return a + b;
    }

    // add two long
    public long add(long a, long b) {
        return a + b;
    }
}
