package com.hades.example.dp.strategy_patttern._3_strategy_patttern.behavior;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
