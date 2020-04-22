package com.hades.example.designpatterns.factory._4_abstract_factory.pizzza;

public class NewYorkStyleClamPizza extends Pizza {
    public NewYorkStyleClamPizza() {
        this.name = "NewYork Style Clam Pizza";

        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
