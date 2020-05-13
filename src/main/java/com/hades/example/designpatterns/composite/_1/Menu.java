package com.hades.example.designpatterns.composite._1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 菜单：组合类
 */
public class Menu extends MenuComponent {
    private String name;
    private String desc;
    private List<MenuComponent> mMenuComponents = new ArrayList<>();

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        mMenuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return mMenuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public void print() {
        System.out.println("\n" + name + ", " + desc);
        System.out.println("------------");

        Iterator<MenuComponent> iterator = mMenuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    public List<MenuComponent> getMenuComponents() {
        return mMenuComponents;
    }
}
