package com.hades.example.designpatterns.command._4_undo;

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
