package com.hades.example.designpatterns.bridge.shape.after;

public class Triangle extends Shape {
    public Triangle(IColor color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
        System.out.println(color.getClass().getSimpleName() + " " + this.getClass().getSimpleName());
    }
}