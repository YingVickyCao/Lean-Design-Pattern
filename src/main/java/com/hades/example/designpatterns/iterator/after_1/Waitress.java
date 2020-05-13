package com.hades.example.designpatterns.iterator.after_1;

public class Waitress {
    PancakeHouseMenu mPancakeHouseMenu = new PancakeHouseMenu();
//    List<MenuItem> mBreakfastItems;

    DinnerMenu mDinnerMenu = new DinnerMenu();
//    MenuItem[] mLunchItems;

    public Waitress() {
//        mBreakfastItems = mPancakeHouseMenu.getMenuItems();
//        mLunchItems = mDinnerMenu.getMenuItems();
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
        return isItemVegetarian(mDinnerMenu.createIterator(), name);
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