package com.hades.example.designpatterns.factory._4_abstract_factory.store;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.Pizza;

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
