package com.hades.example.designpatterns.compound.combining.decorator;

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
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println();
        // Ducks quacked 4 times
        System.out.println("Ducks quacked " + QuackCounter.getNumberOfQuack() + " times");
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}