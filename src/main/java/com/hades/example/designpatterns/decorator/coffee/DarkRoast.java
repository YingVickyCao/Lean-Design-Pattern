package com.hades.example.designpatterns.decorator.coffee;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "Dark House";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
