package com.hades.example.designpatterns.factory._4_abstract_factory.pizzza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.name = "Chicago Style Cheese Pizza";

        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}
