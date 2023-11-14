package com.hades.example.designpatterns.strategy._1_use_Inheritance;

/**
 * 红头鸭
 */
public class ReadHeadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("红头");
    }
}
