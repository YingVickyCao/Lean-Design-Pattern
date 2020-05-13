package com.hades.example.designpatterns.iterator.after_4;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    Menu mPancakeHouseMenu;
    Menu mDinnerMenu;
    Menu mCafeMenu;

    private List<Menu> mMenus;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
        this.mPancakeHouseMenu = pancakeHouseMenu;
        this.mDinnerMenu = dinnerMenu;
        this.mCafeMenu = cafeMenu;
    }

    public Waitress(List<Menu> menus) {
        mMenus = menus;
    }

    public void printMenu() {
//        printMenu(mPancakeHouseMenu.createIterator());
//        printMenu(mDinnerMenu.createIterator());
//        printMenu(mCafeMenu.createIterator());

        Iterator<Menu> iterator = mMenus.iterator();
        while (iterator.hasNext()) {
            Menu menu = iterator.next();
            printMenu(menu.createIterator());
        }
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

        Iterator<Menu> iterator = mMenus.iterator();
        while (iterator.hasNext()) {
            Menu menu = iterator.next();
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

        Iterator<Menu> iterator = mMenus.iterator();
        while (iterator.hasNext()) {
            Menu menu = iterator.next();
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