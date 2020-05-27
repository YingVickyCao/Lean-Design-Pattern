package com.hades.example.designpatterns.proxy._2_gumball_remote_proxy;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());

    private GumballMachine mGumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can not insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        mGumballMachine.setState(mGumballMachine.getNoQuarterState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned..");
//        mGumballMachine.setState(mGumballMachine.getSoldState());
        // 增加产生10%赢的机会
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && (mGumballMachine.getCount() > 1)) {
            mGumballMachine.setState(mGumballMachine.getWinnerQuarter());
        } else {
            mGumballMachine.setState(mGumballMachine.getSoldState());
        }
        return true;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
