package com.hades.example.designpatterns.composite;

// 菜单项：组合类图中的叶类，它实现了组合内元素的行为
public class MenuItem extends MenuComponent {
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
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return name + ", " + desc + ", " + isVegetarian + ", " + price;
    }
}
