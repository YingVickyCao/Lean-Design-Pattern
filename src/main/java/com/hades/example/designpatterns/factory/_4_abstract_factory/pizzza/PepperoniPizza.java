package com.hades.example.designpatterns.factory._4_abstract_factory.pizzza;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzaIngred.factory.IPizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    private IPizzaIngredientFactory mPizzaIngredientFactory;

    public PepperoniPizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        mPizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
//        System.out.println("Preparing " + name);
        mDough = mPizzaIngredientFactory.createDough();
        mSauce = mPizzaIngredientFactory.createSauce();
        mCheese = mPizzaIngredientFactory.createCheese();
        mVeggies = mPizzaIngredientFactory.createVeggies();
        mPepperoni = mPizzaIngredientFactory.createPepperoni();
    }
}
