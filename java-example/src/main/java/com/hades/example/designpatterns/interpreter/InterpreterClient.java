package com.hades.example.designpatterns.interpreter;

public class InterpreterClient {
    private InterpreterEngine ie;

    public InterpreterClient(InterpreterEngine ie) {
        this.ie = ie;
    }

    public int interpret(String input) {
        Expression exp = null;
        if (input.contains("add")) {
            exp = new AddExpression(input);
        } else if (input.contains("subtract")) {
            exp = new SubtractExpression(input);
        }
        int result = exp.interpret(ie);
        System.out.println(input);
        return result;
    }
}