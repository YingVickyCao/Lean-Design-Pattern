package com.hades.example.dp.strategy_patttern._3_strategy_patttern;

import com.hades.example.dp.strategy_patttern._3_strategy_patttern.duck.*;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }

    private void test() {
        Duck redHeadDuck = new ReadHeadDuck();
        print(redHeadDuck);
        System.out.println();

        Duck mallardDuck = new MallardDuck();
        print(mallardDuck);
        System.out.println();

        Duck rubberDuck = new RubberDuck();
        print(rubberDuck);
        System.out.println();

        Duck decoyDuck = new DecoyDuck();
        print(decoyDuck);
        System.out.println();
    }

    private void print(Duck duck) {
        if (null == duck) {
            return;
        }
        duck.display();
        duck.performQuack();
        duck.swim();
        duck.performFly();
    }
}