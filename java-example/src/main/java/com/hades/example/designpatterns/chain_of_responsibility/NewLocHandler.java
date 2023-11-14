package com.hades.example.designpatterns.chain_of_responsibility;

public class NewLocHandler extends Handler{
    public NewLocHandler(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(String subject) {
        return subject.contains("New");
    }
}
