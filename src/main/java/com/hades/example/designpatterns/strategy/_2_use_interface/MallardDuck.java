package com.hades.example.designpatterns.strategy._2_use_interface;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck implements IFly {
    @Override
    public void display() {
        System.out.println("绿头");
    }

    @Override
    public void fly() {
        System.out.println("Can fly");
    }
}
