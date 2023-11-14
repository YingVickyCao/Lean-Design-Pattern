package com.hades.example.designpatterns.compound.combining.adapter;

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
        Quackable gooseDuck = new GooseAdapter(new Goose());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}