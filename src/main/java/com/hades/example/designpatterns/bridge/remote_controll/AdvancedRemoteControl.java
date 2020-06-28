package com.hades.example.designpatterns.bridge.remote_controll;

public class AdvancedRemoteControl extends BasicRemoteControl {
    private int lastVolume = -1;

    public AdvancedRemoteControl(ITV device) {
        super(device);
    }

    public void mute() {
        if (lastVolume != -1) {
            device.setVolume(lastVolume);
            lastVolume = -1;
        } else {
            lastVolume = device.getVolume();
            device.setVolume(0);
        }
    }
}
