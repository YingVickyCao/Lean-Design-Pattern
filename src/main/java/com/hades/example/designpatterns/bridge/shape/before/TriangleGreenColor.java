package com.hades.example.designpatterns.bridge.shape.before;

public class TriangleGreenColor extends Triangle implements IColor{
    @Override
    public void applyColor() {
        System.out.println("Triangle Green Color");
    }
}
