package com.hades.example.designpatterns.composite._2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 煎饼屋菜单
 */
public class PancakeHouseIMenu implements IMenu {
    private List<MenuItem> mMenuItems;

    public PancakeHouseIMenu() {
        mMenuItems = new ArrayList<>();
        addItem("Breakfast 1", "Breakfast 1 desc", true, 2.99);
        addItem("Breakfast 2", "Breakfast 2 desc", false, 2.99);
    }

    public void addItem(String name, String desc, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, isVegetarian, price);
        mMenuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return mMenuItems.iterator();
    }
}
