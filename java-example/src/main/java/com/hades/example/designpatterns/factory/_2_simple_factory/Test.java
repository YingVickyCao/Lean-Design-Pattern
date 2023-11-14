package com.hades.example.designpatterns.factory._2_simple_factory;

public class Test {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza.getClass().getSimpleName());
    }
}
