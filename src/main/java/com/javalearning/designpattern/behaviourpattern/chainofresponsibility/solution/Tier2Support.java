package com.javalearning.designpattern.behaviourpattern.chainofresponsibility.solution;

public class Tier2Support implements SupportHandler{

    private SupportHandler supportHandler;

    @Override
    public void handleRequest(String issueType, String message) {
        if(issueType.equals("medium")) {
            System.out.println("Tier2 handling the issue: " + message);
        } if(supportHandler != null) {
            supportHandler.handleRequest(issueType, message);
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }
}
