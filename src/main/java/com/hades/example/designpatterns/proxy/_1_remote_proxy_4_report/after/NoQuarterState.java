package com.hades.example.designpatterns.proxy._1_remote_proxy_4_report.after;

public class NoQuarterState implements State {
    // add transient,不需要糖果机被序列化并随着State对象一起传送
    private transient GumballMachine mGumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Inserted a quarter");
        mGumballMachine.setState(mGumballMachine.getHasQuarter());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Haven't insert quarter");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned, but there is no quarter");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("Need to pay first.");
    }
}
