package com.hades.example.designpatterns.bridge.shape.before;

public class PentagonGreenColor extends Pentagon implements IColor{
    @Override
    public void applyColor() {
        System.out.println("Pentagon Green Color");
    }
}
