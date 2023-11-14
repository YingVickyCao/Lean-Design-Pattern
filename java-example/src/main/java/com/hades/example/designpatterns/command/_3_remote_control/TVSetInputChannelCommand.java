package com.hades.example.designpatterns.command._3_remote_control;

public class TVSetInputChannelCommand implements Command{
    private TV mTV;

    public TVSetInputChannelCommand(TV TV) {
        mTV = TV;
    }

    @Override
    public void execute() {
        if (null != mTV){
            mTV.setInputChannel();
        }
    }
}
