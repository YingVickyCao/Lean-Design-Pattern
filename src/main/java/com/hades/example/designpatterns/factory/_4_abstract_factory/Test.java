package com.hades.example.designpatterns.factory._4_abstract_factory;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.Pizza;
import com.hades.example.designpatterns.factory._4_abstract_factory.store.ChicagoStylePizzaStore;
import com.hades.example.designpatterns.factory._4_abstract_factory.store.NewYorkStylePizzaStore;
import com.hades.example.designpatterns.factory._4_abstract_factory.store.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore store = new NewYorkStylePizzaStore();

        Pizza pizza = store.orderPizza("cheese");       // NewYork Style Cheese Pizza
        System.out.println(pizza.toString());

        PizzaStore store2 = new ChicagoStylePizzaStore();
        Pizza pizza2 = store2.orderPizza("cheese");     // Chicago Style Cheese Pizza
        System.out.println(pizza2.toString());

        Pizza pizza3 = store2.orderPizza("veggie");     // Chicago Style Veggie Pizza
        System.out.println(pizza3.toString());
    }
}