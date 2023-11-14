package com.hades.example.designpatterns.template_method._1_starbuzz.before;

public class Coffee {

    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }
    // 1 把水煮沸
    public void boilWater(){
        System.out.println("Bolling water");
    }

    // 2 用沸水冲泡咖啡
    public void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee trough filter");
    }

    // 3 把咖啡倒进杯子
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    // 4 加糖和牛奶
    public void addSugarAndMilk(){
        System.out.println("Adding Sugar and Milk");
    }
}