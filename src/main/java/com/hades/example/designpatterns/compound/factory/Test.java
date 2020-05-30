package com.hades.example.designpatterns.compound.factory;

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