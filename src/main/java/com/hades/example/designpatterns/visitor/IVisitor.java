package com.hades.example.designpatterns.visitor;

public interface IVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
}