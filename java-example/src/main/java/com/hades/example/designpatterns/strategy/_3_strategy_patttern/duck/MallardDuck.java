package com.hades.example.designpatterns.strategy._3_strategy_patttern.duck;

import com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior.FlyWithWings;
import com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior.Quack;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("绿头");
    }
}
