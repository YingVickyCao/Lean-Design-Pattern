package com.hades.example.designpatterns.compound.combined.djview;

public class BeatController implements IController {
    private IBeatModel mModel;
    private DJView mDJView;

    public BeatController(IBeatModel Model) {
        mModel = Model;

        mDJView = new DJView(mModel, this);
        mDJView.createControls();
        mDJView.createView();
        mDJView.disableStartMenuItem();
        mDJView.disableStopMenuItem();

        mModel.init();
    }

    @Override
    public void start() {
        mModel.on();
        mDJView.disableStartMenuItem();
        mDJView.enableStopMenuItem();
    }

    @Override
    public void stop() {
        mModel.off();
        mDJView.disableStopMenuItem();
        mDJView.enableStopMenuItem();
    }

    @Override
    public void increaseBPM() {
        mModel.setBPM(mModel.getBPM() + 1);
    }

    @Override
    public void decreaseBPM() {
        mModel.setBPM(mModel.getBPM() - 1);
    }

    @Override
    public void setBPM(int bpm) {
        mModel.setBPM(bpm);
    }
}
