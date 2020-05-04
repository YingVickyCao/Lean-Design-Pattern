package com.hades.example.designpatterns.adapter._1_duck;

public class Test {
    public static void main(String[] args){
        Test test= new Test();
        test.test();
    }
    private void test(){
        Duck duck = new MallardDuck();
        print(duck);
        System.out.println();

        Turkey turkey = new WildTurkey();
        Duck duck2 =  new TurkeyAdapter(turkey);
        turkey.gobble();
        turkey.fly();
        System.out.println();

        print(duck2);
    }

    private void print(Duck duck){
        duck.quack();
        duck.fly();
    }
}