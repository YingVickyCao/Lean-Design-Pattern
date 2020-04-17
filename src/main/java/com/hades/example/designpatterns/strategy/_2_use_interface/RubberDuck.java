package com.hades.example.designpatterns.strategy._2_use_interface;

/**
 * 橡皮鸭：会叫，不会飞
 */
public class RubberDuck  extends Duck implements IQuack{
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }
}
