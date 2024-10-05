package com.javalearning.exceptions;

public class CustomCheckedException extends Exception {

    public CustomCheckedException(String id) {
        super("User with id: " + id + "  found so we can't create user again");
    }
}
