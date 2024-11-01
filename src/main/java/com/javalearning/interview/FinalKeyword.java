package com.javalearning.interview;

final public class FinalKeyword {

    private final String name = "Mohit";

    // stop Overwride from child class
    public final void f1() {
    }
}

// we can't create child of final class
//class Child extends FinalKeyword {
//
//}