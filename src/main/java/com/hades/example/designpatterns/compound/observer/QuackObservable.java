package com.hades.example.designpatterns.compound.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
