package com.hades.example.designpatterns.adapter._2_collection;

import java.util.Enumeration;
import java.util.Iterator;
/**
 * 使用适配器，将 Enumeration 变成一个 Iterator
 */
public class EnumerationIterator implements Iterator {
    private Enumeration mEnumeration;

    public EnumerationIterator(Enumeration enumeration) {
        mEnumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return mEnumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return mEnumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}