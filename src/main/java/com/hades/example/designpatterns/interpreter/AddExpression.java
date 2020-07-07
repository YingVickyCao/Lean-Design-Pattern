package com.hades.example.designpatterns.interpreter;

public class AddExpression implements Expression {
    private String expression;

    public AddExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngine ie) {
        return ie.add(expression);
    }
}
