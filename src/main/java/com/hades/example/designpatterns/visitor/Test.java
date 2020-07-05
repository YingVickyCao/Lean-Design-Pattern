package com.hades.example.designpatterns.visitor;

public class Test {
    public static void main(String[] args) {
        IComputerElement computer = new Computer();
        computer.accept(new Visitor());
    }
}
