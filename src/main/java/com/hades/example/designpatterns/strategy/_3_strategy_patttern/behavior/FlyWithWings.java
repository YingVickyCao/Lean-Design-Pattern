package com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior;

public class FlyWithWings implements IIFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}