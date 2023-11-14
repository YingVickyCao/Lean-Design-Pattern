package com.hades.example.designpatterns.command._5_remote_control_with_macro_and_undo;

/**
 * 按On按钮：同时打开灯光、打开音响、打开TV等
 */
public class MacroCommand implements Command{
    private Command[] mCommands;
    public MacroCommand(Command[] commands) {
        this.mCommands = commands;
    }

    @Override
    public void execute() {
        for (Command item: mCommands){
            item.execute();
        }
    }

    @Override
    public void undo() {
        for (Command item: mCommands){
            item.undo();
        }
    }
}
