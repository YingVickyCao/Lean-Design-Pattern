package com.hades.example.designpatterns.command._2_simple_remote_control;

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