package com.hades.example.designpatterns.bridge.shape.after;

public abstract class Shape {
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }

    abstract void applyColor();
}
