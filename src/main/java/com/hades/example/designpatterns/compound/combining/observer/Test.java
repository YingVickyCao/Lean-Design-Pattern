package com.hades.example.designpatterns.compound.combining.observer;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        test.simulate(duckFactory);
    }

    //quack
    //quack
    //Kwak
    //Squeak
    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseDuck);

        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);

        System.out.println();
        // Ducks quacked 4 times
        System.out.println("Ducks quacked " + QuackCounter.getNumberOfQuack() + " times");
    }

    void simulate(Quackable quackable) {
        quackable.quack();
    }
}