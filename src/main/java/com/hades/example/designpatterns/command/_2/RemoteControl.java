package com.hades.example.designpatterns.command._2;

public class RemoteControl {
    private Command[] mOffCommands;
    private Command[] mOnCommands;

    public RemoteControl() {
        mOffCommands = new Command[7];
        mOnCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            mOnCommands[i] = noCommand;
            mOffCommands[i] = noCommand;
        }
    }

    public void setCommand(int index, Command on, Command off) {
        mOnCommands[index] = on;
        mOffCommands[index] = off;
    }

    public void onButtonPressed(int index) {
//        if (mOnCommands[index] != null) {
            mOnCommands[index].execute();
//        }
    }

    public void offButtonPressed(int index) {
//        if (mOffCommands[index] != null) {
            mOffCommands[index].execute();
//        }
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