package com.hades.example.designpatterns.factory._4_abstract_factory.pizzza;

import com.hades.example.designpatterns.factory._4_abstract_factory.pizzaIngred.factory.IPizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private IPizzaIngredientFactory mPizzaIngredientFactory;

    public ClamPizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        mPizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
//        System.out.println("Preparing " + name);
        mDough = mPizzaIngredientFactory.createDough();
        mSauce = mPizzaIngredientFactory.createSauce();
        mCheese = mPizzaIngredientFactory.createCheese();
        mClams = mPizzaIngredientFactory.createClams();
    }
}
