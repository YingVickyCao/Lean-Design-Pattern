package com.hades.example.designpatterns.composite._2;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    private Stack mStack = new Stack();

    public CompositeIterator(Iterator iterator) {
        mStack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (mStack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) mStack.peek();
            if (!iterator.hasNext()) {
                mStack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) mStack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if (menuComponent instanceof Menu) {
                mStack.push(menuComponent.createIterator());
            }
            return menuComponent;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
