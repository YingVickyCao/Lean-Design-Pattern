package com.hades.example.dp.strategy_patttern._3_strategy_patttern.duck;

import com.hades.example.dp.strategy_patttern._3_strategy_patttern.behavior.IIFlyBehavior;
import com.hades.example.dp.strategy_patttern._3_strategy_patttern.behavior.IQuackBehavior;

public class Duck {
    protected IQuackBehavior quackBehavior;
    protected IIFlyBehavior flyBehavior;

    public void performQuack() {
        if (null != quackBehavior) {
            quackBehavior.quack();
        }
    }

    public void swim() {
        System.out.println("swim");
    }

    public void display() { // 外观
    }

    public void performFly() {
        if (null != flyBehavior) {
            flyBehavior.fly();
        }
    }
}
