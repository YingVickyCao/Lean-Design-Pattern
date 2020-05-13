package com.hades.example.designpatterns.composite._2;

import java.util.Iterator;

/**
 * 餐厅菜单
 * 餐厅菜单
 */
public class DinnerIMenu implements IMenu {
    private static int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] mMenuItems;

    public DinnerIMenu() {
        mMenuItems = new MenuItem[MAX_ITEMS];
        addItem("Dinner 1", "Dinner 1 desc", true, 2.99);
        addItem("Dinner 2", "Dinner 2 desc", false, 3.05);
    }

    public void addItem(String name, String desc, boolean isVegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, desc, isVegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full. Can not add them to menu");
        } else {
            mMenuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(mMenuItems);
    }
}
