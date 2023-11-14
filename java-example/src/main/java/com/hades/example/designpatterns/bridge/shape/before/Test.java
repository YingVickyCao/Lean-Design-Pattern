package com.hades.example.designpatterns.bridge.shape.before;

public class Test {
    public static void main(String[] args) {
        IShape pentagonGreenColor = new PentagonGreenColor();
        System.out.println(pentagonGreenColor.toString());

        IShape pentagonRedColor = new PentagonRedColor();
        System.out.println(pentagonRedColor.toString());

        IShape triangleGreenColor = new TriangleGreenColor();
        System.out.println(triangleGreenColor.toString());

        IShape triangleRedColor = new TriangleRedColor();
        System.out.println(triangleRedColor.toString());
    }
}