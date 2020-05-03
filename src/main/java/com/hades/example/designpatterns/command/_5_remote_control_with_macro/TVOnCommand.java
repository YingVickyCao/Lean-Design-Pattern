package com.hades.example.designpatterns.command._5_remote_control_with_macro;

public class TVOnCommand implements Command {
    private TV mTV;

    public TVOnCommand(TV TV) {
        mTV = TV;
    }

    @Override
    public void execute() {
        if (null != mTV){
            mTV.on();
        }
    }

    @Override
    public void undo() {
        mTV.off();
    }
}
