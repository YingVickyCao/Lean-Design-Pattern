package com.hades.example.designpatterns.command._4_macro;

public class RemoteControlWithUndo {
    private Command[] mOffCommands;
    private Command[] mOnCommands;
    private Command mUndoCommand;

    public RemoteControlWithUndo() {
        mOffCommands = new Command[7];
        mOnCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            mOnCommands[i] = noCommand;
            mOffCommands[i] = noCommand;
        }
        mUndoCommand = noCommand;
    }

    public void setCommand(int index, Command on, Command off) {
        mOnCommands[index] = on;
        mOffCommands[index] = off;
    }

    public void onButtonPressed(int index) {
//        if (mOnCommands[index] != null) {
            mOnCommands[index].execute();
            mUndoCommand = mOnCommands[index];
//        }
    }

    public void offButtonPressed(int index) {
//        if (mOffCommands[index] != null) {
            mOffCommands[index].execute();
            mUndoCommand = mOffCommands[index];
//        }
    }

    public void undoButtonPressed(){
        mUndoCommand.undo();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < mOnCommands.length; i++) {
            result = result + "," + mOnCommands[i].getClass().getName() + "  " + mOnCommands[i].getClass().getName() + "\n";
        }
        return result;
    }
}