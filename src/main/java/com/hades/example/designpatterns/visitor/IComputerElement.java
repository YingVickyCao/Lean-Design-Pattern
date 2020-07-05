package com.hades.example.designpatterns.visitor;

public interface IComputerElement {
    void accept(IVisitor visitor);
}