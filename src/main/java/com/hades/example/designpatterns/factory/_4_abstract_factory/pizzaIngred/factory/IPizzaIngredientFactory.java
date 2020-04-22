package com.hades.example.designpatterns.factory._4_abstract_factory.pizzaIngred.factory;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzaIngred.*;

public interface IPizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggie[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
