package com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior;

public class FlyRocketPowered implements IIFlyBehavior {
    @Override
    public void fly() {
        System.out.println("利用火箭动力飞行");
    }
}
