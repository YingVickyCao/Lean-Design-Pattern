package com.hades.example.designpatterns.iterator.after;

import java.util.List;

public class PrintCustomizeMenu {
    PancakeHouseMenu mPancakeHouseMenu = new PancakeHouseMenu();
    List<MenuItem> mBreakfastItems;

    DinnerMenu mDinnerMenu = new DinnerMenu();
    MenuItem[] mLunchItems;

    public PrintCustomizeMenu() {
        mBreakfastItems = mPancakeHouseMenu.getMenuItems();
        mLunchItems = mDinnerMenu.getMenuItems();
    }

    public void printMenu() {
        for (int i = 0; i < mBreakfastItems.size(); i++) {
            MenuItem menuItem = mBreakfastItems.get(i);
            System.out.println(menuItem.toString());
        }

        for (int i = 0; i < mLunchItems.length; i++) {
            MenuItem menuItem = mLunchItems[i];
            if (null != menuItem){
                System.out.println(menuItem.toString());
            }
        }
    }

    void printBreakfastMenu() {
        for (int i = 0; i < mBreakfastItems.size(); i++) {
            MenuItem menuItem = mBreakfastItems.get(i);
            System.out.println(menuItem.toString());
        }

    }

    void printLunchMenu() {
        for (int i = 0; i < mLunchItems.length; i++) {
            MenuItem menuItem = mLunchItems[i];
            if (null != menuItem){
                System.out.println(menuItem.toString());
            }
        }
    }

    void printVegetarianMenu() {
        for (int i = 0; i < mBreakfastItems.size(); i++) {
            MenuItem menuItem = mBreakfastItems.get(i);
            if (menuItem.isVegetarian()) {
                System.out.println(menuItem.toString());
            }
        }

        for (int i = 0; i < mLunchItems.length; i++) {
            MenuItem menuItem = mLunchItems[i];
            if (null != menuItem){
                if (menuItem.isVegetarian()) {
                    System.out.println(menuItem.toString());
                }
            }
        }
    }

    boolean isItemVegetarian(String name) {
        for (int i = 0; i < mBreakfastItems.size(); i++) {
            MenuItem menuItem = mBreakfastItems.get(i);
            if (menuItem.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }

        for (int i = 0; i < mLunchItems.length; i++) {
            MenuItem menuItem = mLunchItems[i];
            if (null != menuItem){
                if (menuItem.getName().equalsIgnoreCase(name)) {
                    return true;
                }
            }
        }
        return false;
    }
}