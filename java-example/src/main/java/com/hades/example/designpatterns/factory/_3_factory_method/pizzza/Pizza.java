package com.hades.example.designpatterns.factory._3_factory_method.pizzza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza{
    protected String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    /**
     * 准备
     */
    public void prepare() {
//        System.out.println("prepare");
    }

    /**
     * 烘烤
     */
    public void bake() {
//        System.out.println("prepare");
    }

    /**
     * 切片
     */
    public void cut() {
//        System.out.println("cut");
    }

    /**
     * 装盒
     */
    public void box() {
//        System.out.println("box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
