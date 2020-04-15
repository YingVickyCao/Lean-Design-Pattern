package com.hades.example.dp.strategy_patttern._3_strategy_patttern.duck;

import com.hades.example.dp.strategy_patttern._3_strategy_patttern.behavior.FlyWithWings;
import com.hades.example.dp.strategy_patttern._3_strategy_patttern.behavior.Quack;

/**
 * 红头鸭
 */
public class ReadHeadDuck extends Duck {

    public ReadHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("红头");
    }
}
