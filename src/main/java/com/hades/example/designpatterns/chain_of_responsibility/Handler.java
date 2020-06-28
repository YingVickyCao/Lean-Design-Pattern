package com.hades.example.designpatterns.chain_of_responsibility;

public abstract class Handler {
    private String name;
    private Handler next;

    public Handler(String name) {
        this.name = name;
    }

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handleRequest(String subject) {
        if (resolve(subject)) {
            System.out.println("Email ( " + subject + ") is for " + getClass().getSimpleName());
            return;
        }
        if (null != next) {
            next.handleRequest(subject);
        }
    }

    protected abstract boolean resolve(String info);
}
