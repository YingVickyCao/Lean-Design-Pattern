package com.hades.example.designpatterns.compound.combined.djview;

public interface IController {
    void start();

    void stop();

    void increaseBPM();

    void decreaseBPM();

    void setBPM(int bpm);
}
