package com.hades.example.designpatterns.status.after;


public class SoldWithWinnerState implements State {
    private GumballMachine mGumballMachine;

    public SoldWithWinnerState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please Wait. Giving a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Already turned crank");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("You are a Winner . You get two gumballs for your quarter");
        mGumballMachine.releaseBall();
        // 检查糖果是否售完
        if (mGumballMachine.getCount() > 0) {
            mGumballMachine.releaseBall();
            if (mGumballMachine.getCount() > 0) {
                mGumballMachine.setState(mGumballMachine.getNoQuarterState());
            } else {
                System.out.println("Out of gumballs");
                mGumballMachine.setState(mGumballMachine.getSoldOutState());
            }
        } else {
            System.out.println("Out of gumballs");
            mGumballMachine.setState(mGumballMachine.getSoldOutState());
        }
    }
}
