package com.hades.example.designpatterns.decorator.condiment;

import com.hades.example.designpatterns.decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}