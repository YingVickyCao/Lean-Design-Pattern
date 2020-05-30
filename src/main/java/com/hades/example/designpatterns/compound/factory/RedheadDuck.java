package com.hades.example.designpatterns.compound.factory;

// 红头鸭
public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
