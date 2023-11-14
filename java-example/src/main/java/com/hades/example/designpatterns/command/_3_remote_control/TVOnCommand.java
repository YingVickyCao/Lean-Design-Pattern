package com.hades.example.designpatterns.command._3_remote_control;

public class TVOnCommand implements Command{
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
}
