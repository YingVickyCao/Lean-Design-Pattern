package com.hades.example.designpatterns.command._4_remote_control_with_undo;

public class LightOnCommand implements Command {
    private Light mLight;

    public LightOnCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.on();
    }

    @Override
    public void undo() {
        mLight.off();
    }
}
