package com.hades.example.designpatterns.visitor;

public class Computer implements IComputerElement {
    private Mouse mMouse;
    private Keyboard mKeyboard;

    public Computer() {
        mMouse = new Mouse();
        mKeyboard = new Keyboard();
    }

    @Override
    public void accept(IVisitor visitor) {
        mMouse.accept(visitor);
        mKeyboard.accept(visitor);
        visitor.visit(this);
    }

    public int getPrice(){
        return 10000;
    }
}