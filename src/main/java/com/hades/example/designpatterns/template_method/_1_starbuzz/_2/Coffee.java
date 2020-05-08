package com.hades.example.designpatterns.template_method._1_starbuzz._2;

public class Coffee extends CaffeineBeverage {

    // 1 把水煮沸
    public void boilWater() {
        System.out.println("Bolling water");
    }

    // 2 用沸水冲泡咖啡
    @Override
    void brew() {
        System.out.println("Dripping Coffee trough filter");
    }

    // 3 把咖啡倒进杯子
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // 4 加糖和牛奶
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}