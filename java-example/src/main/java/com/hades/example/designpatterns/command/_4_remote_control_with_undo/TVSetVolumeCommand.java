package com.hades.example.designpatterns.command._4_remote_control_with_undo;

public class TVSetVolumeCommand implements Command {
    private TV mTV;
    private int prevVolume;

    public TVSetVolumeCommand(TV TV) {
        mTV = TV;
    }

    @Override
    public void execute() {
        if (null != mTV){
            prevVolume = mTV.getVolume();
            mTV.setVolume(11);
        }
    }

    @Override
    public void undo() {
        mTV.setVolume(prevVolume);
    }
}
