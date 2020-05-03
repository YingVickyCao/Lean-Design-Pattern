package com.hades.example.designpatterns.command._4_undo;

public class CeilingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    private int mSpeed = OFF;
    public CeilingFan() {
    }

    public void off(){
        mSpeed = OFF;
        System.out.println("CeilingFan is off ");
    }
    public void low(){
        mSpeed = LOW;
        System.out.println("CeilingFan speed is low ");
    }

    public void medium(){
        mSpeed = MEDIUM;
        System.out.println("CeilingFan speed is medium ");
    }

    public void high(){
        mSpeed = HIGH;
        System.out.println("CeilingFan speed is high ");
    }

    public int getSpeed() {
        return mSpeed;
    }
}
