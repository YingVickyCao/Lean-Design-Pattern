package com.hades.example.designpatterns.composite;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeIMenu implements IMenu {
    private Hashtable menuItems = new Hashtable();

    public CafeIMenu() {
        addItem("Cafe 1", "Cafe 1 desc", false, 3.99);
        addItem("Cafe 2", "Cafe 2 desc", true, 5.0);
    }

    public void addItem(String name, String desc, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, isVegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
