package com.hades.example.designpatterns.status.after;


public class WinnerState implements State {
    private GumballMachine mGumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
