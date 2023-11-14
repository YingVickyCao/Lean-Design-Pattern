package com.hades.example.designpatterns.factory._3_factory_method.store;

import com.hades.example.designpatterns.factory._3_factory_method.pizzza.*;

public class NewYorkPizzaStore extends PizzaStore {
    public NewYorkPizzaStore() {
        super();
    }

    // - GreekPizza
    // + ClamPizza,VeggiePizza
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NewYorkStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NewYorkStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new NewYorkStyleClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new NewYorkStyleVeggiePizza();
        }
        return pizza;
    }
}
