package com.hades.example.designpatterns.proxy._1_remote_proxy.before;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }


    private void test() {
        GumballMachine machine = new GumballMachine("Location_1", 5);
        GumballMonitor monitor = new GumballMonitor(machine);
        monitor.report();

        GumballMachine machine2 = new GumballMachine("Location_2", 0);
        GumballMonitor monitor2 = new GumballMonitor(machine2);
        monitor2.report();
    }
}