package com.hades.example.designpatterns.strategy._3_strategy_patttern.duck;

import com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior.FlyNoWay;
import com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior.Squeak;

/**
 * 橡皮鸭：会叫，不会飞
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }
}
