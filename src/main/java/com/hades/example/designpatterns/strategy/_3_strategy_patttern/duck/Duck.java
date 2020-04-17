package com.hades.example.designpatterns.strategy._3_strategy_patttern.duck;

import com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior.IIFlyBehavior;
import com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior.IQuackBehavior;

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

    public void setFlyBehavior(IIFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
