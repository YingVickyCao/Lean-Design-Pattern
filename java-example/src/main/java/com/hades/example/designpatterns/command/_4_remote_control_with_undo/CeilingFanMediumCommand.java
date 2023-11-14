package com.hades.example.designpatterns.command._4_remote_control_with_undo;

public class CeilingFanMediumCommand implements Command {
    private CeilingFan mCeilingFan;
    private int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        mCeilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = mCeilingFan.getSpeed();
        mCeilingFan.medium();
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
