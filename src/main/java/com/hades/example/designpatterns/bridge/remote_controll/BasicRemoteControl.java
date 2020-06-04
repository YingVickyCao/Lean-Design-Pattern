package com.hades.example.designpatterns.bridge.remote_controll;

public class BasicRemoteControl implements IRemoteControl {
    protected IDevice device;

    public BasicRemoteControl() {
    }

    public BasicRemoteControl(IDevice device) {
        this.device = device;
    }

    public void setDevice(IDevice device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (!device.isOn()) {
            device.on();
        } else {
            device.off();
        }
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public String toString() {
        if (null == device) {
            return "This Remote Control has not bound Device yet.";
        }
        return "Device " + device.getClass().getSimpleName() + " " + device.toString();
    }
}
