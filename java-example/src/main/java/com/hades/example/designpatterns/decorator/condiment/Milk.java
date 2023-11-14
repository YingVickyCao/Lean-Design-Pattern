package com.hades.example.designpatterns.decorator.condiment;

import com.hades.example.designpatterns.decorator.coffee.Beverage;

public class Milk extends CondimentDecorator {
    private Beverage mBeverage;

    public Milk(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return mBeverage.cost() + 0.10;
    }
}
