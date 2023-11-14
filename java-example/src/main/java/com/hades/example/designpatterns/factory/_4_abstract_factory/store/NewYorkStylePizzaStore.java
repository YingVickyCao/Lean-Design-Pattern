package com.hades.example.designpatterns.factory._4_abstract_factory.store;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzaIngred.factory.IPizzaIngredientFactory;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzaIngred.factory.NewYorkPizzaIngredientFactory;
import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.*;

public class NewYorkStylePizzaStore extends PizzaStore {
    public NewYorkStylePizzaStore() {
        super();
    }

    // - GreekPizza
    // + ClamPizza,VeggiePizza
    @Override
    Pizza createPizza(String type) {
        IPizzaIngredientFactory pizzaIngredientFactory = new NewYorkPizzaIngredientFactory();
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
