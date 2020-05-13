package com.hades.example.designpatterns.iterator.after_1;

public class DinnerMenuIterator implements Iterator {
    private MenuItem[] mMenuItems;
    private int position = 0;

    public DinnerMenuIterator(MenuItem[] menuItems) {
        mMenuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= mMenuItems.length || mMenuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = mMenuItems[position];
        position = position + 1;
        return menuItem;
    }
}