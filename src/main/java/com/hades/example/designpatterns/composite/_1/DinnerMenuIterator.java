package com.hades.example.designpatterns.composite._1;

import java.util.Iterator;

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

    @Override
    public void remove() throws UnsupportedOperationException {
        if (position <= 0) {
            throw new IllegalStateException("Can remove an item until done at least on next");
        }
        if (mMenuItems[position - 1] != null) {
            for (int i = position - 1; i < mMenuItems.length - 1; i++) {
                mMenuItems[i] = mMenuItems[i + 1];
            }
            mMenuItems[mMenuItems.length - 1] = null;
        }
    }
}