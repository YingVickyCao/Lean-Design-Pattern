package com.hades.example.dp.strategy_patttern._1_use_Inheritance;

/**
 * 橡皮鸭：会叫，不会飞
 */
public class RubberDuck  extends Duck{
    @Override
    public void fly() {
    }

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }
}
