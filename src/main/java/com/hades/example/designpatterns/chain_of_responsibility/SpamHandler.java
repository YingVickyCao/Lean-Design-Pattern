package com.hades.example.designpatterns.chain_of_responsibility;

public class SpamHandler extends Handler{
    public SpamHandler(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(String subject) {
        return subject.contains("Spam");
    }
}
