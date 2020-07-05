package com.hades.example.designpatterns.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveToMemento() {
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        setState(memento.getState());
    }
}