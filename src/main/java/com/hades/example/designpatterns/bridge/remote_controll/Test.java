package com.hades.example.designpatterns.bridge.remote_controll;

public class Test {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new TV());
    }

    private static void testDevice(IDevice device) {
        BasicRemoteControl basicRemoteControl = new BasicRemoteControl(device);
        basicRemoteControl.power();
        System.out.println(basicRemoteControl.toString());

        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(device);
        advancedRemoteControl.power();
        advancedRemoteControl.mute();
        System.out.println(advancedRemoteControl.toString());
    }
}
