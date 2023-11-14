package com.hades.example.designpatterns.adapter._1_duck;

/**
 * 绿头鸭
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
