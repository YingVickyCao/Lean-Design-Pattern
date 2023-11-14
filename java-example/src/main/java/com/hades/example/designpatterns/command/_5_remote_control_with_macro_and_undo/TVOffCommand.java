package com.hades.example.designpatterns.command._5_remote_control_with_macro_and_undo;

public class TVOffCommand implements Command {
    private TV mTV;

    public TVOffCommand(TV TV) {
        mTV = TV;
    }

    @Override
    public void execute() {
        if (null != mTV){
            mTV.off();
        }
    }

    @Override
    public void undo() {
        mTV.on();
    }
}
