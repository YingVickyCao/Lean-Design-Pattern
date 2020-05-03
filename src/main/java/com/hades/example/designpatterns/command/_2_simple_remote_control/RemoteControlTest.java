package com.hades.example.designpatterns.command._2_simple_remote_control;

public class RemoteControlTest {
    public static void main(String [] args){
        RemoteControlTest remoteControlTest = new RemoteControlTest();
        remoteControlTest.test();
    }

    /**
     * Light is on
     * Light is off
     */
    private void test(){
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand on = new LightOnCommand(light);
        LightOffCommand off = new LightOffCommand(light);

        remoteControl.setCommand(on);
        remoteControl.buttonPressed();

        remoteControl.setCommand(off);
        remoteControl.buttonPressed();
    }
}
