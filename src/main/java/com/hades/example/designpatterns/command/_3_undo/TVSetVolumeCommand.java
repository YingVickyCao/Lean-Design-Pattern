package com.hades.example.designpatterns.command._3_undo;

public class TVSetVolumeCommand implements Command {
    private TV mTV;

    public TVSetVolumeCommand(TV TV) {
        mTV = TV;
    }

    @Override
    public void execute() {
        if (null != mTV){
            mTV.setVolume(11);
        }
    }
}
