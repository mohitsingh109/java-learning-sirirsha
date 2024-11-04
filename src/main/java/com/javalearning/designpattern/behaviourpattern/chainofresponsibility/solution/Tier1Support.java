package com.javalearning.designpattern.behaviourpattern.chainofresponsibility.solution;

public class Tier1Support implements SupportHandler{

    private SupportHandler supportHandler;

    @Override
    public void handleRequest(String issueType, String message) {
        // if tier 1 not able to handle the request move to next handler
        if(issueType.equals("low")) {
            System.out.println("Tier1 support handling the request: " + message);
        } if(supportHandler != null) {
            supportHandler.handleRequest(issueType, message);
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }
}
