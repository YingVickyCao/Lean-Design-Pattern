package com.hades.example.designpatterns.adapter._1_duck;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
