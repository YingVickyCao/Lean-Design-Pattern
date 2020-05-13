package com.hades.example.designpatterns.composite._1;

import java.util.Iterator;

public class CompositeIterator implements Iterator {
    public CompositeIterator(Iterator iterator) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
