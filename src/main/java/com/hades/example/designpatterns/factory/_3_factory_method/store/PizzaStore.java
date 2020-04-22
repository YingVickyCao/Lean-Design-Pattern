package com.hades.example.designpatterns.factory._3_factory_method.store;

import com.hades.example.designpatterns.factory._3_factory_method.pizzza.Pizza;

public abstract class PizzaStore {

    public PizzaStore() {
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        if (null != pizza) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
