package com.hades.example.dp.strategy_patttern._3_strategy_patttern.behavior;

public class FlyRocketPowered implements IIFlyBehavior {
    @Override
    public void fly() {
        System.out.println("利用火箭动力飞行");
    }
}
