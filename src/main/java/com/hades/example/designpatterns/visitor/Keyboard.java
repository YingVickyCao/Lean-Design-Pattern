package com.hades.example.designpatterns.visitor;

public class Keyboard implements IComputerElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getPrice(){
        return 700;
    }
}