package com.hades.example.designpatterns.status.after;

public class Test {
    public static void main(String[] args){
        Test test = new Test();
        test.test();

//        Random randomWinner = new Random(System.currentTimeMillis());
//        int winner = randomWinner.nextInt(10);
//        System.out.println(winner);
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