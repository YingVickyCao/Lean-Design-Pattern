package com.hades.example.designpatterns.command._4_remote_control_with_undo;

public class LightOffCommand implements Command {
    private Light mLight;

    public LightOffCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.off();
    }

    @Override
    public void undo() {
        mLight.off();
    }
}
