package com.hades.example.designpatterns.compound.adapter;

// 绿头鸭
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
