package com.hades.example.designpatterns.command._2;

public class TV {
    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void setInputChannel() {
        System.out.println("Change Channel");
    }

    public void setVolume(int volume) {
        System.out.println("Change Volume " + volume);
    }
}
