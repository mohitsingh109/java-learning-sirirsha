package com.javalearning.interview;

public interface DefaultMethod {

    String text();

    default String text1() {
        return "default";
    }
}
