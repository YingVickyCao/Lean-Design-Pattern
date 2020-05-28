package com.hades.example.designpatterns.proxy._3_gumball_with_rmi_report;

public class GumballMonitor {
    private GumballMachine mGumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("GumballMachine"
                + " location=" + mGumballMachine.getLocation()
                + ",gumball count=" + mGumballMachine.getCount()
                + ",state=" + mGumballMachine.getState().getClass().getSimpleName());
    }
}
