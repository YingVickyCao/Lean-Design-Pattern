package com.hades.example.designpatterns.command._1;

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