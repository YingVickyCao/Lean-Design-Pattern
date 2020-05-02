package com.hades.example.designpatterns.command._3_undo;

public interface Command {
    void execute();
    void undo();
}
