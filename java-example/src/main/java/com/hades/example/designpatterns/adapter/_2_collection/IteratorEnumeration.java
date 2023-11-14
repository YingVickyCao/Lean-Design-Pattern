package com.hades.example.designpatterns.adapter._2_collection;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 使用适配器，将 Iterator 变成一个 Enumeration
 */
public class IteratorEnumeration implements Enumeration {
    private Iterator mIterator;

    public IteratorEnumeration(Iterator iterator) {
        mIterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return mIterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return mIterator.next();
    }
}