package com.hades.example.designpatterns.factory._3_factory_method.pizzza;

public class NewYorkStyleVeggiePizza extends Pizza {
    public NewYorkStyleVeggiePizza() {
        this.name = "NewYork Style Veggie Pizza";

        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
