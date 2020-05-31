package com.hades.example.designpatterns.compound.observer;

// 橡皮鸭
public class RubberDuck implements Quackable {
    private Observable mObservable;

    public RubberDuck() {
        mObservable = new Observable(this);
    }

    @Override
    public void quack() {
        // 橡皮鸭 会呱呱叫，声音是吱吱叫
        System.out.println("Squeak");
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
