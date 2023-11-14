package com.hades.example.designpatterns.factory._2_simple_factory;

public class SimplePizzaFactory {
    // - GreekPizza
    // + ClamPizza,VeggiePizza
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        }
//        else if ("greek".equals(type)) {
//            pizza = new GreekPizza();
//        }
        else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
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
