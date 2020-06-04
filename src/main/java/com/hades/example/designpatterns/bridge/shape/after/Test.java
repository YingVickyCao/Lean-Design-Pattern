package com.hades.example.designpatterns.bridge.shape.after;

public class Test {
    public static void main(String[] args) {
        Shape greenPentagon = new Pentagon(new GreenColor());
        greenPentagon.applyColor();

        Shape redPentagon = new Pentagon(new RedColor());
        redPentagon.applyColor();

        Shape greenTriangle = new Triangle(new GreenColor());
        greenTriangle.applyColor();

        Shape redTriangle = new Triangle(new RedColor());
        redTriangle.applyColor();
    }
}
