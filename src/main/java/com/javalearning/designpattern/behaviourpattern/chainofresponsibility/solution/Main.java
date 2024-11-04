package com.javalearning.designpattern.behaviourpattern.chainofresponsibility.solution;

public class Main {

    public static void main(String[] args) {
        SupportHandler tier1 = new Tier1Support();
        SupportHandler tier2 = new Tier2Support();
        SupportHandler manager = new ManagerSupport();
        SupportHandler svp = new SVPSupport();

        // if tier 1 not able to handle the request forward to tier2
        //creating a chain
        tier1.setNextHandler(tier2);
        tier2.setNextHandler(manager);
        manager.setNextHandler(svp);

        tier1.handleRequest("low", "password reset request");
        tier1.handleRequest("medium", "Issue with software installation");
        tier1.handleRequest("high", "System outage");
        tier1.handleRequest("critical", "System hacked");
    }
}
