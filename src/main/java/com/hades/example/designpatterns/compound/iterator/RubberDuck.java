package com.hades.example.designpatterns.compound.iterator;

// 橡皮鸭
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        // 橡皮鸭 会呱呱叫，声音是吱吱叫
        System.out.println("Squeak");
    }
}
