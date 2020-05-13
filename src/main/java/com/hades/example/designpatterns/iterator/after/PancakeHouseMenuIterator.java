package com.hades.example.designpatterns.iterator.after;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    private List<MenuItem> mMenuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        mMenuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= mMenuItems.size() || mMenuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = mMenuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
