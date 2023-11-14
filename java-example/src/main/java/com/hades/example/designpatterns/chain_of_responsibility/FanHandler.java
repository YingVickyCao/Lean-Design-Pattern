package com.hades.example.designpatterns.chain_of_responsibility;

public class FanHandler extends Handler{
    public FanHandler(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(String subject) {
        return subject.contains("Like") || subject.contains("love");
    }
}
