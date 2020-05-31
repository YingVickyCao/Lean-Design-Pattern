package com.hades.example.designpatterns.compound.combining.observer;

// 红头鸭
public class RedheadDuck implements Quackable {
    private Observable mObservable;

    public RedheadDuck() {
        mObservable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        mObservable.notifyObservers();
    }
}
