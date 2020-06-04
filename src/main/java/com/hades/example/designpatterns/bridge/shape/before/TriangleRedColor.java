package com.hades.example.designpatterns.bridge.shape.before;

public class TriangleRedColor extends Triangle implements IColor{
    @Override
    public void applyColor() {
        System.out.println("Triangle Red Color");
    }
}
