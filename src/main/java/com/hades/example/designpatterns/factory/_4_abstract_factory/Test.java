package com.hades.example.designpatterns.factory._4_abstract_factory;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzza.Pizza;
import com.hades.example.designpatterns.factory._4_abstract_factory.store.ChicagoStylePizzaStore;
import com.hades.example.designpatterns.factory._4_abstract_factory.store.NewYorkStylePizzaStore;
import com.hades.example.designpatterns.factory._4_abstract_factory.store.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore store = new NewYorkStylePizzaStore();

        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza.getName()); // NewYork Style Cheese Pizza

        PizzaStore store2 = new ChicagoStylePizzaStore();
        Pizza pizza2 = store2.orderPizza("cheese");
        System.out.println(pizza2.getName()); // Chicago Style Cheese Pizza
   }
}