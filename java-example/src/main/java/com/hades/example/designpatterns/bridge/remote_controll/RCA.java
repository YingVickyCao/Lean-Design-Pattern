package com.hades.example.designpatterns.bridge.remote_controll;

public class RCA implements ITV {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public void on() {
        on = true;
    }

    @Override
    public void off() {
        on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= 100) {
            this.volume = 100;
        } else this.volume = Math.max(volume, 0);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public String toString() {
        return "{" +
                "on=" + on +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
