package com.hades.example.designpatterns.template_method._1_starbuzz.after;

// 咖啡因饮料
public abstract class CaffeineBeverageWithHook {
    // prepareRecipe是模板方法
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("Bolling water");
    }

    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();

    boolean customerWantsCondiments() {
        return true;
    }
}
