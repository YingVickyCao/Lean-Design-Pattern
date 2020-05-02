package com.hades.example.designpatterns.command._2;

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
