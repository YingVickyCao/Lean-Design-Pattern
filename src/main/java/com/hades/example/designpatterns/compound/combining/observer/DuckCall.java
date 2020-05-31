package com.hades.example.designpatterns.compound.combining.observer;

// 鸭鸣器：猎人使用的东西。
public class DuckCall implements Quackable {
    private Observable mObservable;

    public DuckCall() {
        mObservable = new Observable(this);
    }

    @Override
    public void quack() {
        // 鸭鸣器会呱呱叫，但听起来不十分像真的鸭叫声
        System.out.println("Kwak");
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
