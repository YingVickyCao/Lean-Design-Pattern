package com.hades.example.designpatterns.chain_of_responsibility;

public class Test {
    public static void main(String[] args){
        Handler spamHandler = new SpamHandler("Spam subject");
        Handler fanHandler= new FanHandler("Like gumball machine");
        Handler complaint= new ComplaintHandler("Complaint");
        Handler newLocHandler = new NewLocHandler("New gumball machine");
        Handler noHandler = new NoHandler("");

        spamHandler.setNext(fanHandler).setNext(complaint).setNext(newLocHandler).setNext(noHandler);

        spamHandler.handleRequest("Spam subject");
        spamHandler.handleRequest("Like gumball machine");
        spamHandler.handleRequest("Complaint");
        spamHandler.handleRequest("New gumball machine");
        spamHandler.handleRequest("No title");
    }
}