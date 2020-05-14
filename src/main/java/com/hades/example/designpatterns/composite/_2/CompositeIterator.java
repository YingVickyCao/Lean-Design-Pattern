package com.hades.example.designpatterns.composite._2;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    private Stack mStack = new Stack();

    /**
     * 将组合的迭代器传入
     */
    public CompositeIterator(Iterator iterator) {
        mStack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (mStack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) mStack.peek();
            // 没有下一个了，则弹出栈，然后递归地调用hasNext
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
        // 当客户要取得下一个元素时，先调用hasNext()来确定是否还有下一个
        if (hasNext()) {
            Iterator iterator = (Iterator) mStack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            // 如果元素是个菜单，也是需要被包含进遍历的组合
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
