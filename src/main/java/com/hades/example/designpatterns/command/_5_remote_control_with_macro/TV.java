package com.hades.example.designpatterns.command._5_remote_control_with_macro;

public class TV {
    private int mChannel = 1;
    private int mVolume  = 3;

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    // Default = 1
    public void setInputChannel(int channel) {
        System.out.println("Change Channel " + channel);
        this.mChannel = channel;
    }

    public int getChannel() {
        return mChannel;
    }

    public void setVolume(int volume) {
        System.out.println("Change Volume " + volume);
        this.mVolume = volume;
    }

    public int getVolume() {
        return mVolume;
    }
}
