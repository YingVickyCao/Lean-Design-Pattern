package com.hades.example.designpatterns.command._5_remote_control_with_macro;

/**
 * 空对象：什么也不做
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
