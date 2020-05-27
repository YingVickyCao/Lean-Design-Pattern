package com.hades.example.designpatterns.proxy._1_gumball;

public class NoQuarterState implements State {
    private GumballMachine mGumballMachine;

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
