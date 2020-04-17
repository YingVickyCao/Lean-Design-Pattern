package com.hades.example.designpatterns.strategy._1_use_Inheritance;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("绿头");
    }
}
