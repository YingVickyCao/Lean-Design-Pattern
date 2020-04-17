package com.hades.example.designpatterns.strategy._3_strategy_patttern.behavior;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
