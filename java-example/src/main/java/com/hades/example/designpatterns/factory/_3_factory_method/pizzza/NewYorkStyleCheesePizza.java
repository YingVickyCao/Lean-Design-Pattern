package com.hades.example.designpatterns.factory._3_factory_method.pizzza;

public class NewYorkStyleCheesePizza extends Pizza {
    public NewYorkStyleCheesePizza() {
        this.name = "NewYork Style Cheese Pizza";

        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
