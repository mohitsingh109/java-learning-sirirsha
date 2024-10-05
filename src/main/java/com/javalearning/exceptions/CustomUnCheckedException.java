package com.javalearning.exceptions;

public class CustomUnCheckedException extends RuntimeException {

    public CustomUnCheckedException(String userName) {
        super("Username: " + userName + " is invalid");
    }
}
