package com.javalearning.designpattern.behaviourpattern.chainofresponsibility.wrong;

public class Main {

    public static void main(String[] args) {
        SupportHandler supportHandler = new SupportHandler();
        supportHandler.handleRequest("low", "Password reset request");
        supportHandler.handleRequest("medium", "Issue with software installation");
        supportHandler.handleRequest("high", "System outage");
    }
}
