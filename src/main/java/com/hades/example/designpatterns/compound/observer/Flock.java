package com.hades.example.designpatterns.compound.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackableList = new ArrayList<>();

    public Flock() {
    }

    public void add(Quackable quackable) {
        quackableList.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterable = quackableList.iterator();
        while (iterable.hasNext()) {
            Quackable quackable = iterable.next();
            quackable.quack();
            notifyObservers();
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterable = quackableList.iterator();
        while (iterable.hasNext()) {
            Quackable quackable = iterable.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }
}
