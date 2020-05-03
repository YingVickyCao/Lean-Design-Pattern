package com.hades.example.designpatterns.command._3;

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
