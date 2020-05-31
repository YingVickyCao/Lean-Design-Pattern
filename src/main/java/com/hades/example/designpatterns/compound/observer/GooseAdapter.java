package com.hades.example.designpatterns.compound.observer;

public class GooseAdapter implements Quackable {
    Goose mGoose;
    private Observable mObservable;

    public GooseAdapter(Goose goose) {
        mGoose = goose;
        mObservable = new Observable(this);
    }

    @Override
    public void quack() {
        mGoose.honk();
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