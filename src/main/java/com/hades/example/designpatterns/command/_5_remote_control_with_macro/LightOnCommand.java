package com.hades.example.designpatterns.command._5_remote_control_with_macro;

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
