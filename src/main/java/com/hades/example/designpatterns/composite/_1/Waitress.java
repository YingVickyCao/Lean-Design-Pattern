package com.hades.example.designpatterns.composite._1;

import java.util.Iterator;
import java.util.List;

// 菜单的主要客户
public class Waitress {
    MenuComponent allMenus;

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

    void printBreakfastMenu(MenuComponent menuComponent) {
        menuComponent.print();
    }

    void printLunchMenu() {
        MenuComponent menuComponent = allMenus.getChild(1);
        menuComponent.print();
    }

    void printLunchMenu(MenuComponent menuComponent) {
        menuComponent.print();
    }

    void printVegetarianMenu() {
        List<MenuComponent> list = allMenus.getMenuComponents();
        Iterator<MenuComponent> iterator = list.iterator();
        printVegetarianMenu(iterator);
    }

    private void printVegetarianMenu(Iterator<MenuComponent> iterator) {
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            if (menuComponent.isVegetarian()) {
                menuComponent.print();
            } else {
                List<MenuComponent> list = menuComponent.getMenuComponents();
                if (null != list) {
                    printVegetarianMenu(list.iterator());
                }
            }
        }
    }

    boolean isItemVegetarian(String name) {
        List<MenuComponent> list = allMenus.getMenuComponents();
        Iterator<MenuComponent> iterator = list.iterator();
        return isItemVegetarian(iterator, name);
    }

    private boolean isItemVegetarian(Iterator<MenuComponent> iterator, String name) {
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            if (menuComponent.isVegetarian() && menuComponent.getName().equalsIgnoreCase(name)) {
                return true;
            } else {
                List<MenuComponent> list = menuComponent.getMenuComponents();
                if (null != list) {
                     return isItemVegetarian(list.iterator(), name);
                }
            }
        }
        return false;
    }
}