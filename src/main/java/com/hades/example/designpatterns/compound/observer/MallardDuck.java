package com.hades.example.designpatterns.compound.observer;

// 绿头鸭
public class MallardDuck implements Quackable {
    private Observable mObservable;

    public MallardDuck() {
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
