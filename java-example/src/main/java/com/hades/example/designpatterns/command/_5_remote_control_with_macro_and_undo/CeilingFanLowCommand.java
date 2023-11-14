package com.hades.example.designpatterns.command._5_remote_control_with_macro_and_undo;

public class CeilingFanLowCommand implements Command {
    private CeilingFan mCeilingFan;
    private int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        mCeilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = mCeilingFan.getSpeed();
        mCeilingFan.low();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            mCeilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            mCeilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            mCeilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            mCeilingFan.off();
        }
    }
}
