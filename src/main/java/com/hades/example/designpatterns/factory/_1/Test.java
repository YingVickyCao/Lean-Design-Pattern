package com.hades.example.designpatterns.factory._1;

public class Test {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza.getClass().getSimpleName());
    }
}
