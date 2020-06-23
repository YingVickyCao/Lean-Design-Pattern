package com.hades.example.designpatterns.compound.combined.mvc.djview;

public class DJViewTest {
    public static void main(String[] args){
        IBeatModel model = new BeatModel();
        IController controller = new BeatController(model);
    }
}
