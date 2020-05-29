package com.hades.example.designpatterns.proxy._1_remote_proxy.after;

public class SoldStatus implements State {
    // add transient,不需要糖果机被序列化并随着State对象一起传送
    private transient GumballMachine mGumballMachine;

    public SoldStatus(GumballMachine gumballMachine) {
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
        mGumballMachine.releaseBall();
        // 检查糖果是否售完
        if (mGumballMachine.getCount() > 0) {
            mGumballMachine.setState(mGumballMachine.getNoQuarterState());
        } else {
            System.out.println("Out of gumballs");
            mGumballMachine.setState(mGumballMachine.getSoldOutState());
        }
    }
}
