package com.hades.example.designpatterns.template_method._1_starbuzz.after;

public class Coffee extends CaffeineBeverage {
    // 2 用沸水冲泡咖啡
    @Override
    void brew() {
        System.out.println("Dripping Coffee trough filter");
    }

    // 4 加糖和牛奶
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}