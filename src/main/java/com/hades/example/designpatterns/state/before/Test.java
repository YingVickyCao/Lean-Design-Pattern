package com.hades.example.designpatterns.state.before;

public class Test {
    public static void main(String[] args){
        Test test = new Test();
        test.test();
    }


    private void test(){
        GumballMachine machine = new GumballMachine(5);
        System.out.println(machine.toString());
        System.out.println();

        machine.insertQuarter();
        machine.turnCrank();
        System.out.println(machine.toString());
        System.out.println();

        machine.insertQuarter();
        machine.ejectQuarter();
        System.out.println(machine.toString());
        System.out.println();

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.ejectQuarter();
        System.out.println(machine.toString());
        System.out.println();

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        System.out.println();
    }
}