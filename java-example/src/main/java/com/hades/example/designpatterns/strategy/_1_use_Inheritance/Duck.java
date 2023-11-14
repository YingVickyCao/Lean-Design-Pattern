package com.hades.example.designpatterns.strategy._1_use_Inheritance;

public class Duck {
    public void quack() { // 呱呱叫
        System.out.println("呱呱叫");
    }

    public void swim() {
        System.out.println("swim");
    }

    public void display() { // 外观
    }

    public void fly() {
        System.out.println("Can fly");
    }
}
