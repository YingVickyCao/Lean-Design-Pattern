package com.hades.example.designpatterns.compound.combining.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        List<Quackable> quackableList = new ArrayList<>();
        quackableList.add(mallardDuck);
        quackableList.add(redheadDuck);
        quackableList.add(duckCall);
        quackableList.add(rubberDuck);
        quackableList.add(gooseDuck);

        simulate(quackableList);

        System.out.println();
        // Ducks quacked 4 times
        System.out.println("Ducks quacked " + QuackCounter.getNumberOfQuack() + " times");
    }

//    void simulate(Quackable quackable) {
//        quackable.quack();
//    }

    void simulate(List<Quackable> quackableList) {
        Iterator<Quackable> iterable = quackableList.iterator();
        while (iterable.hasNext()) {
            Quackable quackable = iterable.next();
            quackable.quack();
        }
    }


}