package com.hades.example.designpatterns.command._2;

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
