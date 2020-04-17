package com.hades.example.designpatterns.observer._3_use_observer_patttern_java;

public interface Subject {
    // 注册观察者
    void registerObserver(Observer observer);

    // 删除观察者
    void removeObserver(Observer observer);

    // 当主题的状态改变时，通知所有观察者
    void notifyObservers();
}
