package com.hades.example.designpatterns.command;

public class LightOnCommand implements Command{
    private Light mLight;

    public LightOnCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.on();
    }
}
