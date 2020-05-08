package com.hades.example.designpatterns.template_method._1_starbuzz._2;

// 咖啡因饮料
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Bolling water");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();
}
