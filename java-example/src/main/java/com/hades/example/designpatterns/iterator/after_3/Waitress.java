package com.hades.example.designpatterns.iterator.after_3;

import java.util.Iterator;

public class Waitress {
    Menu mPancakeHouseMenu;
    Menu mDinnerMenu;
    Menu mCafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
        this.mPancakeHouseMenu = pancakeHouseMenu;
        this.mDinnerMenu = dinnerMenu;
        this.mCafeMenu = cafeMenu;
    }

    public void printMenu() {
//        for (int i = 0; i < mBreakfastItems.size(); i++) {
//            MenuItem menuItem = mBreakfastItems.get(i);
//            System.out.println(menuItem.toString());
//        }
        printMenu(mPancakeHouseMenu.createIterator());

//        for (int i = 0; i < mLunchItems.length; i++) {
//            MenuItem menuItem = mLunchItems[i];
//            if (null != menuItem) {
//                System.out.println(menuItem.toString());
//            }
//        }
        printMenu(mDinnerMenu.createIterator());
        printMenu(mCafeMenu.createIterator());
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.toString());
        }
    }

    void printBreakfastMenu() {
//        for (int i = 0; i < mBreakfastItems.size(); i++) {
//            MenuItem menuItem = mBreakfastItems.get(i);
//            System.out.println(menuItem.toString());
//        }
        printMenu(mPancakeHouseMenu.createIterator());
    }

    void printLunchMenu() {
//        for (int i = 0; i < mLunchItems.length; i++) {
//            MenuItem menuItem = mLunchItems[i];
//            if (null != menuItem) {
//                System.out.println(menuItem.toString());
//            }
//        }
        printMenu(mDinnerMenu.createIterator());
    }

    void printVegetarianMenu() {
//        for (int i = 0; i < mBreakfastItems.size(); i++) {
//            MenuItem menuItem = mBreakfastItems.get(i);
//            if (menuItem.isVegetarian()) {
//                System.out.println(menuItem.toString());
//            }
//        }

        printVegetarianMenu(mPancakeHouseMenu.createIterator());

//        for (int i = 0; i < mLunchItems.length; i++) {
//            MenuItem menuItem = mLunchItems[i];
//            if (null != menuItem) {
//                if (menuItem.isVegetarian()) {
//                    System.out.println(menuItem.toString());
//                }
//            }
//        }
        printVegetarianMenu(mDinnerMenu.createIterator());
        printVegetarianMenu(mCafeMenu.createIterator());
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
//        for (int i = 0; i < mBreakfastItems.size(); i++) {
//            MenuItem menuItem = mBreakfastItems.get(i);
//            if (menuItem.getName().equalsIgnoreCase(name)) {
//                return true;
//            }
//        }

        if (isItemVegetarian(mPancakeHouseMenu.createIterator(), name)) {
            return true;
        }

//        for (int i = 0; i < mLunchItems.length; i++) {
//            MenuItem menuItem = mLunchItems[i];
//            if (null != menuItem) {
//                if (menuItem.getName().equalsIgnoreCase(name)) {
//                    return true;
//                }
//            }
//        }

        if (isItemVegetarian(mDinnerMenu.createIterator(), name)) {
            return true;
        }

        isItemVegetarian(mCafeMenu.createIterator(), name);

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