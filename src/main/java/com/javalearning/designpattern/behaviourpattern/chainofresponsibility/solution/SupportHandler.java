package com.javalearning.designpattern.behaviourpattern.chainofresponsibility.solution;

public interface SupportHandler {
    void handleRequest(String issueType, String message);
    void setNextHandler(SupportHandler supportHandler);
}
