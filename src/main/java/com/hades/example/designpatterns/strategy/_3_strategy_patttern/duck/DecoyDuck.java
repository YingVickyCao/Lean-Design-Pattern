package com.hades.example.designpatterns.strategy._3_strategy_patttern.duck;

import com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior.FlyNoWay;
import com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior.MuteQuack;

/**
 * 诱饵鸭：木头鸭，不会飞，不会叫
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("诱饵鸭");
    }
}
