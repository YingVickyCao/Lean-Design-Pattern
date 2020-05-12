package com.hades.example.designpatterns.template_method._2_starbuzz_with_template_method;

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
