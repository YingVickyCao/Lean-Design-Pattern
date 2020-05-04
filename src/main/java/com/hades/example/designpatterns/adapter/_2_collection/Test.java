package com.hades.example.designpatterns.adapter._2_collection;

import java.util.*;

public class Test {
    public static void main(String [] args){
        Test test = new Test();
        test.test();
    }

    private void test(){
        List<String> list1 = new ArrayList<>();
        list1.add("Iterator 1");
        list1.add("Iterator 2");

        Vector<String> vector = new Vector<>();
        vector.add("Enumeration 1");
        vector.add("Enumeration 2");

        Iterator iterator = list1.iterator();
        loopIterator(iterator);
        System.out.println();

        Iterator  iterator2= new EnumerationIterator(vector.elements());
        loopIterator(iterator2);
        System.out.println();

        // ---
        loopEnumeration(vector.elements());
        System.out.println();

        Enumeration  enumeration2 = new IteratorEnumeration(list1.iterator());
        loopEnumeration(enumeration2);
    }

    private void loopIterator(Iterator  iterator ){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private void loopEnumeration(Enumeration enumeration){
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
