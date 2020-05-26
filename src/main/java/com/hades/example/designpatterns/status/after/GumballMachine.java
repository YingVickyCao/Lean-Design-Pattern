package com.hades.example.designpatterns.status.after;

/**
 * 糖果销售机
 */
public class GumballMachine {
    // 售完糖果
    public final static int STATUS_SOLD_OUT = 0;
    State soldOutState;

    // 售出糖果
    public final static int STATUS_SOLD = 1;
    State soldState;
    // 没有25分钱
    public final static int STATUS_NO_QUARTER = 2;
    State noQuarterState;

    // 有25分钱
    public final static int STATUS_HAS_QUARTER = 3;
    State hasQuarter;

    //    int state = STATUS_SOLD_OUT;
    State state = soldOutState;

    // 糖果数目
    int count = 0;


    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldStatus(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarter = new HasQuarterState(this);

        this.count = count;
        if (count > 0) {
//            state = STATUS_NO_QUARTER;
            state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
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
        state.turnCrank();
        state.dispense();
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
