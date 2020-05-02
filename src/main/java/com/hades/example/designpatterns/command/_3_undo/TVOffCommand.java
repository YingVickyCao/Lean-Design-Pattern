package com.hades.example.designpatterns.command._3_undo;

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
}
