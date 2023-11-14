package com.hades.example.designpatterns.compound.combining.adapter;

// 鸭鸣器：猎人使用的东西。
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        // 鸭鸣器会呱呱叫，但听起来不十分像真的鸭叫声
        System.out.println("Kwak");
    }
}
