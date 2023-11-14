package com.hades.example.designpatterns.factory._3_factory_method;

import com.hades.example.designpatterns.factory._3_factory_method.pizzza.Pizza;
import com.hades.example.designpatterns.factory._3_factory_method.store.ChicagoPizzaStore;
import com.hades.example.designpatterns.factory._3_factory_method.store.NewYorkPizzaStore;
import com.hades.example.designpatterns.factory._3_factory_method.store.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore store = new NewYorkPizzaStore();

        Pizza pizza = store.orderPizza("cheese");   // NewYork Style Cheese Pizza
        System.out.println(pizza.getName());
        System.out.println(pizza.toString());

        PizzaStore store2 = new ChicagoPizzaStore();
        Pizza pizza2 = store2.orderPizza("cheese"); // Chicago Style Cheese Pizza
        System.out.println(pizza2.getName());
        System.out.println(pizza2.toString());

        Pizza pizza3 = store2.orderPizza("veggie"); // Chicago Style Veggie Pizza
        System.out.println(pizza3.getName());
        System.out.println(pizza3.toString());
   }
}