package com.hades.example.designpatterns.factory._4_abstract_factory.store;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.NewYorkStyleCheesePizza;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.NewYorkStyleClamPizza;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.NewYorkStylePepperoniPizza;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.Pizza;

public class NewYorkStylePizzaStore extends PizzaStore {
    public NewYorkStylePizzaStore() {
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
            pizza = new NewYorkStyleCheesePizza();
        }

        if (null != pizza) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
}
