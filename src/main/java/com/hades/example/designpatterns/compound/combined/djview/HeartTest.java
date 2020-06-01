package com.hades.example.designpatterns.compound.combined.djview;

public class HeartTest {
    public static void main(String[] args){
        IHeartModel model = new HeartModel();
        IController controller = new HeartController(model);
    }
}
