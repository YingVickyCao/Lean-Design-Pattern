package com.hades.example.designpatterns.template_method._1_starbuzz.before;

public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    // 1 把水煮沸
    public void boilWater() {
        System.out.println("Bolling water");
    }

    // 2 用沸水冲泡茶叶
    public void steepTeaBag() {
        System.out.println("Dripping Coffee trough filter");
    }

    // 3 把茶倒进杯子
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // 4 加柠檬
    public void addLemon() {
        System.out.println("Adding Lemon");
    }
}