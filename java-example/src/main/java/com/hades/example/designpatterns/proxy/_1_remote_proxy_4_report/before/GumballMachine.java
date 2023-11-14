package com.hades.example.designpatterns.proxy._1_remote_proxy_4_report.before;

/**
 * 糖果销售机
 */
public class GumballMachine {
    private State soldOutState;     // 售完糖果
    private State soldState;        // 售出糖果
    private State noQuarterState;   // 没有25分钱
    private State hasQuarter;       // 有25分钱
    private State winnerQuarter;    // 抽中10%赢的机会

    private State state;

    // 糖果数目
    private int count = 0;
    private String location;

    public GumballMachine(String location, int count) {
        this.location = location;

        soldOutState = new SoldOutState(this);
        soldState = new SoldStatus(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarter = new HasQuarterState(this);
        winnerQuarter = new SoldWithWinnerState(this);

        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    // 动作：投入25分钱
    public void insertQuarter() {
        state.insertQuarter();
    }

    // 动作：退回25分钱
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    // 动作：转动曲柄
    public void turnCrank() {
        if (state.turnCrank()) {
            state.dispense();
        }
    }

    void releaseBall() {
        // slot(窄缝)
        if (count != 0) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getWinnerQuarter() {
        return winnerQuarter;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state.getClass().getSimpleName() +
                ", count=" + count +
                '}';
    }
}