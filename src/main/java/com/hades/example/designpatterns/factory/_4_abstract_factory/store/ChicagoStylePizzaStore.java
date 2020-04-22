package com.hades.example.designpatterns.factory._4_abstract_factory.store;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.ChicagoStyleCheesePizza;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.ChicagoStyleClamPizza;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.ChicagoStylePepperoniPizza;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    public ChicagoStylePizzaStore() {
        super();
    }

    // - GreekPizza
    // + ClamPizza,VeggiePizza
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
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
