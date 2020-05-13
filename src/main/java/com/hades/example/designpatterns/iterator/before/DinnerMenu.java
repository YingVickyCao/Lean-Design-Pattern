package com.hades.example.designpatterns.iterator.before;

/**
 * 餐厅菜单
 * 餐厅菜单
 */
public class DinnerMenu {
    private static int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] mMenuItems;

    public DinnerMenu() {
        mMenuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Faked) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Bacon with lettuce & tomato on whole wheat", "Pancakes with fried eggs,sausage", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog,with sauerkraut, relish, onions, topped with cheese", false, 3.05);
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

    public MenuItem[] getMenuItems() {
        return mMenuItems;
    }
}
