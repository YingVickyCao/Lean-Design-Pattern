package com.hades.example.dp.strategy_patttern._3_strategy_patttern.behavior;

public class FlyWithWings implements IIFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}