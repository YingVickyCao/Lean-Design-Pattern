package com.hades.example.designpatterns.command;

public class SimpleRemoteControl {
    private Command mSlot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command slot) {
        mSlot = slot;
    }

    public void buttonPressed() {
        mSlot.execute();
    }
}
