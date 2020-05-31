package com.hades.example.designpatterns.compound.iterator;

// 红头鸭
public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
