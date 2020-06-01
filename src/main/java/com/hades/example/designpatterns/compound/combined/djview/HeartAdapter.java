package com.hades.example.designpatterns.compound.combined.djview;

public class HeartAdapter implements IBeatModel{
    IHeartModel heart;

    public HeartAdapter(IHeartModel heart) {
        this.heart = heart;
    }

    @Override
    public void init() {

    }

    public void on() {}

    public void off() {}

    public int getBPM() {
        return heart.getHeartRate();
    }

    public void setBPM(int bpm) {}

    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }

    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }

    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }

    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}
