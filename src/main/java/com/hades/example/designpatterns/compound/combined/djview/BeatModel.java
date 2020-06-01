package com.hades.example.designpatterns.compound.combined.djview;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements IBeatModel, MetaEventListener {
    // 定序器产生真实的节拍
    private Sequencer Sequencer;
    private List<BeatObserver> mBeatObservers = new ArrayList<>();
    private List<BPMObserver> mBPMObservers = new ArrayList<>();
    private int mBpm = 90;
    private Sequence mSequence;
    private Track mTrack;

    @Override
    public void init() {
        setUpMidi();
        buildTrackAndStart();
    }

    public void setUpMidi() {
        try {
            Sequencer = MidiSystem.getSequencer();
            Sequencer.open();
            Sequencer.addMetaEventListener(this);

            mSequence = new Sequence(Sequence.PPQ, 4);

            mTrack = mSequence.createTrack();

            Sequencer.setTempoInBPM(getBPM());
            Sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void meta(MetaMessage meta) {
        if (meta.getType() == 47) {
            notifyBeatObservers();
            Sequencer.start();
            setBPM(getBPM());
        }
    }

    public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};

        mSequence.deleteTrack(null);
        mTrack = mSequence.createTrack();

        makeTracks(trackList);
        mTrack.add(makeEvent(192, 9, 1, 0, 4));
        try {
            Sequencer.setSequence(mSequence);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeTracks(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];

            if (key != 0) {
                mTrack.add(makeEvent(144, 9, key, 100, i));
                mTrack.add(makeEvent(128, 9, key, 100, i + 1));
            }
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }

    @Override
    public void on() {
        Sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        Sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.mBpm = bpm;
        Sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    @Override
    public int getBPM() {
        return mBpm;
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        mBeatObservers.add(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        int index = mBeatObservers.indexOf(observer);
        if (index != -1) {
            mBeatObservers.remove(observer);
        }
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        mBPMObservers.add(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        int index = mBPMObservers.indexOf(observer);
        if (index != -1) {
            mBPMObservers.remove(observer);
        }
    }

    private void notifyBPMObservers() {
        for (BPMObserver item : mBPMObservers) {
            item.updateBPM();
        }
    }

    private void notifyBeatObservers() {
        for (BeatObserver item : mBeatObservers) {
            item.updateBeat();
        }
    }
}