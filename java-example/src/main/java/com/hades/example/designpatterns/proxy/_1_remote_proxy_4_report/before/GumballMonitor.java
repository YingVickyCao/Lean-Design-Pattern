package com.hades.example.designpatterns.proxy._1_remote_proxy_4_report.before;

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
