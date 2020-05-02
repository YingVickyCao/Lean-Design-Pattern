package com.hades.example.designpatterns.command._4_macro;

public class CeilingFanHighCommand implements Command {
    private CeilingFan mCeilingFan;
    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        mCeilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = mCeilingFan.getSpeed();
        mCeilingFan.high();
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
