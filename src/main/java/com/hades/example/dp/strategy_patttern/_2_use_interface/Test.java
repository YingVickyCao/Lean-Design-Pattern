package com.hades.example.dp.strategy_patttern._2_use_interface;

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
        duck.quack();
        duck.swim();
        duck.display();
        duck.fly();
    }
}