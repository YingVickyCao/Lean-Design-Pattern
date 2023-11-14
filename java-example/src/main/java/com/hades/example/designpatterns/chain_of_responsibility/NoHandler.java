package com.hades.example.designpatterns.chain_of_responsibility;

public class NoHandler extends Handler{
    public NoHandler(String name) {
        super(name);
    }

    @Override
    public void handleRequest(String subject) {
        System.out.println("Email ( " + subject + ") cannot be handled in " + getClass().getSimpleName());
    }

    @Override
    protected boolean resolve(String info) {
        return false;
    }
}
