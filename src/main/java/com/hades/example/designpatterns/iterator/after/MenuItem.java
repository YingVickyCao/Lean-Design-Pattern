package com.hades.example.designpatterns.iterator.after;

public class MenuItem {
    private String name;
    private String desc;
    private boolean isVegetarian;
    private double price;

    public MenuItem(String name, String desc, boolean isVegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", " + desc + ", " + isVegetarian + ", " + price;
    }
}
