package com.hades.example.designpatterns.factory._3_factory_method.store;

import com.hades.example.designpatterns.factory._3_factory_method.pizzza.NewYorkStyleCheesePizza;
import com.hades.example.designpatterns.factory._3_factory_method.pizzza.NewYorkStyleClamPizza;
import com.hades.example.designpatterns.factory._3_factory_method.pizzza.NewYorkStylePepperoniPizza;
import com.hades.example.designpatterns.factory._3_factory_method.pizzza.Pizza;

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
