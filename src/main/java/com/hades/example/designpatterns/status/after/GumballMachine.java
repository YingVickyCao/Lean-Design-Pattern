package com.hades.example.designpatterns.status.after;

/**
 * 糖果销售机
 */
public class GumballMachine {
    // 售完糖果
    public final static int STATUS_SOLD_OUT = 0;
    // 售出糖果
    public final static int STATUS_SOLD = 1;
    // 没有25分钱
    public final static int STATUS_NO_QUARTER = 2;
    // 有25分钱
    public final static int STATUS_HAS_QUARTER = 3;

    int state = STATUS_SOLD_OUT;
    // 糖果数目
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = STATUS_NO_QUARTER;
        }
    }

    // 动作：投入25分钱
    public void insertQuarter() {
        if (state == STATUS_HAS_QUARTER) {
            System.out.println("Can not insert another quarter");
        } else if (state == STATUS_SOLD_OUT) {
            System.out.println("Can not insert quarter. sold out");
        } else if (state == STATUS_SOLD) {
            System.out.println("Please Wait. Giving a gumball.");
        } else if (state == STATUS_NO_QUARTER) {
            state = STATUS_HAS_QUARTER;
            System.out.println("Inserted a quarter");
        }
    }

    // 动作：退回25分钱
    public void ejectQuarter() {
        if (state == STATUS_HAS_QUARTER) {
            state = STATUS_NO_QUARTER;
        } else if (state == STATUS_NO_QUARTER) {
            System.out.println("Haven't insert quarter");
        } else if (state == STATUS_SOLD) {
            System.out.println("Already turned crank");
        } else if (state == STATUS_SOLD_OUT) {
            System.out.println("Can not eject.Haven't insert quarter");
        }
    }

    // 动作：转动曲柄
    public void turnCrank() {
        if (state == STATUS_SOLD) {
            state = STATUS_NO_QUARTER;
        } else if (state == STATUS_NO_QUARTER) {
            System.out.println("You turned, but there is no quarter");
        } else if (state == STATUS_SOLD_OUT) {
            System.out.println("You turned, but there is no gumball");
        } else if (state == STATUS_HAS_QUARTER) {
            System.out.println("You turned..");
            state = STATUS_SOLD;
            dispense();
        }
    }

    // 动作：发放糖果
    public void dispense() {
        if (state == STATUS_SOLD) {
            // slot(窄缝)
            System.out.println("A gumball comes rolling out the slot");
            count--;

            // 检查糖果是否售完
            if (count == 0) {
                System.out.println("Out of gumballs");
                state = STATUS_SOLD_OUT;
            } else {
                state = STATUS_NO_QUARTER;
            }
        } else if (state == STATUS_NO_QUARTER) {
            System.out.println("Need to pay first.");
        } else if (state == STATUS_SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == STATUS_HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    private String printState(int state) {
        switch (state) {
            case STATUS_SOLD:
                return "STATUS_SOLD";

            case STATUS_SOLD_OUT:
                return "STATUS_SOLD_OUT";

            case STATUS_NO_QUARTER:
                return "STATUS_NO_QUARTER";

            case STATUS_HAS_QUARTER:
                return "STATUS_HAS_QUARTER";

        }
        return "Invalid";
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + printState(state) +
                ", count=" + count +
                '}';
    }
}
