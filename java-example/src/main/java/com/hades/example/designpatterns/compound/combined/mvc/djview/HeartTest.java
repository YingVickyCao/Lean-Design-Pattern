package com.hades.example.designpatterns.compound.combined.mvc.djview;

public class HeartTest {
    public static void main(String[] args){
        IHeartModel model = new HeartModel();
        IController controller = new HeartController(model);
    }
}
