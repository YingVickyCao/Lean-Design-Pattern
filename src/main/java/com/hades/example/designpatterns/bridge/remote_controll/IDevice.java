package com.hades.example.designpatterns.bridge.remote_controll;

public interface IDevice {
    void on();

    void off();

    boolean isOn();

    void setVolume(int volume);

    int getVolume();

    void setChannel(int channel);

    int getChannel();
}
