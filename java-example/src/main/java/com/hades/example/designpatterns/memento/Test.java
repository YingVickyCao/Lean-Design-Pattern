package com.hades.example.designpatterns.memento;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        setState(originator,careTaker,"State #1");
        originator.setState("State #2");
        setState(originator,careTaker,"State #3");
        setState(originator,careTaker,"State #4");

        System.out.println("Current State: " + originator.getState());
        originator.restoreFromMemento(careTaker.get(1));
        System.out.println("After restore, State: " + originator.getState());
    }

    private static void setState(Originator originator, CareTaker careTaker, String state) {
        originator.setState(state);
        careTaker.add(originator.saveToMemento());
    }
}