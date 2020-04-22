package com.hades.example.designpatterns.factory._4_abstract_factory.pizzza;

public class NewYorkStyleCheesePizza extends Pizza {
    public NewYorkStyleCheesePizza() {
        this.name = "NewYork Style Cheese Pizza";

        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
