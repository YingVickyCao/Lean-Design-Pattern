package com.hades.example.designpatterns.compound.combining.composite;

public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int numberOfQuack;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;
    }

    public static int getNumberOfQuack() {
        return numberOfQuack;
    }
}
