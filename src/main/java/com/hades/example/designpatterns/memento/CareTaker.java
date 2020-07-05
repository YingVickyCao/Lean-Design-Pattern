package com.hades.example.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mMementoList = new ArrayList<>();

    public void add(Memento state) {
        mMementoList.add(state);
    }

    public Memento get(final int index) {
        return mMementoList.get(index);
    }
}
