package com.hades.example.designpatterns.command._3_undo;

public class TVSetInputChannelCommand implements Command {
    private TV mTV;
    private int prevChannel;

    public TVSetInputChannelCommand(TV TV) {
        mTV = TV;
    }

    @Override
    public void execute() {
        if (null != mTV) {
            prevChannel = mTV.getChannel();
            mTV.setInputChannel(10);
        }
    }

    @Override
    public void undo() {
        mTV.setInputChannel(10);
    }
}
