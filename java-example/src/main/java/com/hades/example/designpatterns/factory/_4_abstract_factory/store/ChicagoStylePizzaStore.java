package com.hades.example.designpatterns.factory._4_abstract_factory.store;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzaIngred.factory.ChicagoPizzaIngredientFactory;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzaIngred.factory.IPizzaIngredientFactory;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    public ChicagoStylePizzaStore() {
        super();
    }

    // - GreekPizza
    // + ClamPizza,VeggiePizza
    @Override
    Pizza createPizza(String type) {
        IPizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        return pizza;
    }
}
