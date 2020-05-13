package com.hades.example.designpatterns.iterator.after_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 煎饼屋菜单
 */
public class PancakeHouseMenu implements Menu {
    private List<MenuItem> mMenuItems;

    public PancakeHouseMenu() {
        mMenuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs,sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles,with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String desc, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, isVegetarian, price);
        mMenuItems.add(menuItem);
    }

//    public List<MenuItem> getMenuItems() {
//        return mMenuItems;
//    }

    @Override
    public Iterator createIterator() {
        return mMenuItems.iterator();
    }
}
