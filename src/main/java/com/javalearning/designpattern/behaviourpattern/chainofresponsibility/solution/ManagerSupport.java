package com.javalearning.designpattern.behaviourpattern.chainofresponsibility.solution;

public class ManagerSupport implements SupportHandler {

    private SupportHandler supportHandler;

    @Override
    public void handleRequest(String issueType, String message) {
        if(issueType.equals("high")) {
            System.out.println("Manager handling the issue: " + message);
        } else if(supportHandler != null) {
            supportHandler.handleRequest(issueType, message);
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }
}
