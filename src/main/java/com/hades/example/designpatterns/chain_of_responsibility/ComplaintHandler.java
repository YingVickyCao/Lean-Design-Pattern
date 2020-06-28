package com.hades.example.designpatterns.chain_of_responsibility;

public class ComplaintHandler extends Handler{
    public ComplaintHandler(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(String subject) {
        return subject.contains("child")|| subject.contains("Complaint");
    }
}
