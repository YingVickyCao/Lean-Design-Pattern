package com.hades.example.designpatterns.visitor;

public class Visitor implements IVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard.");
    }
}