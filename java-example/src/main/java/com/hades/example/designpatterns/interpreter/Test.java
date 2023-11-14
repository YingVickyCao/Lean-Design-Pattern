package com.hades.example.designpatterns.interpreter;

public class Test {
    public static void main(String args[]) {
        InterpreterClient ic = new InterpreterClient(new InterpreterEngine());
        System.out.println("Result = " + ic.interpret("add 12 and 13"));
        System.out.println("Result = " + ic.interpret("subtract 76 from 621"));
    }
}