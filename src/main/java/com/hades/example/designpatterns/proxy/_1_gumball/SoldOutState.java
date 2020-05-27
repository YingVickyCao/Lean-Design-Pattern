package com.hades.example.designpatterns.proxy._1_gumball;

public class SoldOutState implements State {
    private GumballMachine mGumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can not insert quarter. sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Can not eject.Haven't insert quarter");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned, but there is no gumball");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
