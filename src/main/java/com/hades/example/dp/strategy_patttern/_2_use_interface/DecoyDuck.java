package com.hades.example.dp.strategy_patttern._2_use_interface;

/**
 * 诱饵鸭：木头鸭，不会飞，不会叫
 */
public class DecoyDuck extends Duck {
    @Override
    public void quack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void display() {
        System.out.println("诱饵鸭");
    }
}
