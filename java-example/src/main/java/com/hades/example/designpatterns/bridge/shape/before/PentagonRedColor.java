package com.hades.example.designpatterns.bridge.shape.before;

public class PentagonRedColor extends Pentagon implements IColor{
    @Override
    public void applyColor() {
        System.out.println("Pentagon Red Color");
    }
}
