package com.hades.example.designpatterns.composite._2;

import java.util.Iterator;
import java.util.List;

// 菜单的主要客户
public class Waitress {
    IMenu mPancakeHouseMenu;
    IMenu mDinnerMenu;
    IMenu mCafeMenu;

    MenuComponent allMenus;

    private List<IMenu> mMenus;

    public Waitress(IMenu pancakeHouseMenu, IMenu dinnerMenu, IMenu cafeMenu) {
        this.mPancakeHouseMenu = pancakeHouseMenu;
        this.mDinnerMenu = dinnerMenu;
        this.mCafeMenu = cafeMenu;
    }

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public Waitress(List<IMenu> menus) {
        mMenus = menus;
    }

    public void printMenu() {
        allMenus.print();
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.toString());
        }
    }

    void printBreakfastMenu() {
        printMenu(mPancakeHouseMenu.createIterator());
    }

    void printLunchMenu() {
        printMenu(mDinnerMenu.createIterator());
    }

    void printVegetarianMenu() {
//        printVegetarianMenu(mPancakeHouseMenu.createIterator());
//        printVegetarianMenu(mDinnerMenu.createIterator());
//        printVegetarianMenu(mCafeMenu.createIterator());

        Iterator<IMenu> iterator = mMenus.iterator();
        while (iterator.hasNext()) {
            IMenu menu = iterator.next();
            printVegetarianMenu(menu.createIterator());
        }
    }

    private void printVegetarianMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if (null != menuItem) {
                if (menuItem.isVegetarian()) {
                    System.out.println(menuItem.toString());
                }
            }
        }
    }


    boolean isItemVegetarian(String name) {
//        if (isItemVegetarian(mPancakeHouseMenu.createIterator(), name)) {
//            return true;
//        }
//        if (isItemVegetarian(mDinnerMenu.createIterator(), name)) {
//            return true;
//        }
//
//        if (isItemVegetarian(mCafeMenu.createIterator(), name)) {
//            return true;
//        }

        Iterator<IMenu> iterator = mMenus.iterator();
        while (iterator.hasNext()) {
            IMenu menu = iterator.next();
            if (isItemVegetarian(menu.createIterator(), name)) {
                return true;
            }
        }


        return false;
    }

    private boolean isItemVegetarian(Iterator iterator, String name) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            if (null != menuItem) {
                if (menuItem.getName().equalsIgnoreCase(name)) {
                    return true;
                }
            }
        }
        return false;
    }
}