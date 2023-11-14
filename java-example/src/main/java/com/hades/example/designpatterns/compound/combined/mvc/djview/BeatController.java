package com.hades.example.designpatterns.compound.combined.mvc.djview;

public class BeatController implements IController {
    private IBeatModel mModel;
    private DJView mDJView;

    public BeatController(IBeatModel model) {
        mModel = model;

        mDJView = new DJView(this, mModel);
        mDJView.createControls();
        mDJView.createView();
        mDJView.enableStartMenuItem();
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
        mDJView.enableStartMenuItem();
        mDJView.disableStopMenuItem();
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
