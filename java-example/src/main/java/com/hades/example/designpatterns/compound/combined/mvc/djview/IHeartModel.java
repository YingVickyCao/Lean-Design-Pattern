package com.hades.example.designpatterns.compound.combined.mvc.djview;

public interface IHeartModel {
    int getHeartRate();

    void registerObserver(BeatObserver observer);

    void removeObserver(BeatObserver observer);

    void registerObserver(BPMObserver observer);

    void removeObserver(BPMObserver observer);
}