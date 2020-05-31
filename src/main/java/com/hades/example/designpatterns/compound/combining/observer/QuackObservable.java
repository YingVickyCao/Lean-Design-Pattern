package com.hades.example.designpatterns.compound.combining.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
