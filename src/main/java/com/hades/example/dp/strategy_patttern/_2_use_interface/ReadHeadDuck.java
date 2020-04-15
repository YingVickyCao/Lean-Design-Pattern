package com.hades.example.dp.strategy_patttern._2_use_interface;

/**
 * 红头鸭
 */
public class ReadHeadDuck extends Duck implements IFly {
    @Override
    public void display() {
        System.out.println("红头");
    }

    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
