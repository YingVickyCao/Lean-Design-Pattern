package com.hades.example.designpatterns.composite._2;

import com.hades.example.designpatterns.composite._1.IMenu;

import java.util.Iterator;

// 菜单的主要客户
public class Waitress {
    IMenu mPancakeHouseMenu;
    IMenu mDinnerMenu;
    IMenu mCafeMenu;

    MenuComponent allMenus;

    public Waitress(IMenu pancakeHouseMenu, IMenu dinnerMenu, IMenu cafeMenu) {
        this.mPancakeHouseMenu = pancakeHouseMenu;
        this.mDinnerMenu = dinnerMenu;
        this.mCafeMenu = cafeMenu;
    }

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    void printBreakfastMenu() {
        MenuComponent menuComponent = allMenus.getChild(0);
        menuComponent.print();
    }

    void printLunchMenu() {
        MenuComponent menuComponent = allMenus.getChild(1);
        menuComponent.print();
    }

    void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
//            try {
//                if (menuComponent.isVegetarian()) {
//                    menuComponent.print();
//                }
//            } catch (UnsupportedOperationException e) {
//
//            }
            if (menuComponent.isVegetarian()) {
                menuComponent.print();
            }
        }
    }

    boolean isItemVegetarian(String name) {
        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
//            try {
//                 if (menuComponent.getName().equalsIgnoreCase(name) && menuComponent.isVegetarian()) {
//                      return true;
//                  }
//            } catch (UnsupportedOperationException e) {
//
//            }
            if (menuComponent.getName().equalsIgnoreCase(name) && menuComponent.isVegetarian()) {
                return true;
            }
        }
        return false;
    }
}