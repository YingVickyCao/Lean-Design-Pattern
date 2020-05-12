package com.hades.example.designpatterns.template_method._1_starbuzz.after;

public class Tea extends CaffeineBeverage {
    // 2 用沸水冲泡茶叶
    @Override
    void brew() {
        System.out.println("Dripping Coffee trough filter");
    }

    // 4 加柠檬
    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}