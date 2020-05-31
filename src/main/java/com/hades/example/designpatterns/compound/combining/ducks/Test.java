package com.hades.example.designpatterns.compound.combining.ducks;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.simulate();
    }

    //quack
    //quack
    //Kwak
    //Squeak
    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}