package com.javalearning.designpattern.behaviourpattern.chainofresponsibility.wrong;

public class SupportHandler {

    public void handleRequest(String issueType, String message) {
        if(issueType.equals("low")) {
            System.out.println("Tier 1 support handling the issue: "+ message);
        } else if(issueType.equals("medium")) {
            System.out.println("Tier 2 support handling the issue: " + message);
        } else if(issueType.equals("high")) {
            System.out.println("Manager handling the issue: " + message);
        } else {
            System.out.println("Unsupported issue type: " + issueType);
        }
    }
}
