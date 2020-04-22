package com.hades.example.designpatterns.factory._2_simple_factory;

public class PizzaStore {
    private SimplePizzaFactory mPizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        mPizzaFactory = pizzaFactory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = mPizzaFactory.createPizza(type);
        if (null != pizza) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
}
