package com.hades.example.designpatterns.interpreter;

public interface Expression {
    int interpret(InterpreterEngine context);
}
