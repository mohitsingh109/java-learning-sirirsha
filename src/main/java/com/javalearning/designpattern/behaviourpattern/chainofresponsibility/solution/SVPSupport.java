package com.javalearning.designpattern.behaviourpattern.chainofresponsibility.solution;

public class SVPSupport implements SupportHandler{

    private SupportHandler supportHandler;

    @Override
    public void handleRequest(String issueType, String message) {
        if(issueType.equals("critical")) {
            System.out.println("SVP handling the issue: "+ message);
        } else if(supportHandler != null) {
            supportHandler.handleRequest(issueType, message);
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }
}
