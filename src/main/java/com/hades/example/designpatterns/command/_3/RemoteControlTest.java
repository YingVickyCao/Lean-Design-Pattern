package com.hades.example.designpatterns.command._3;

public class RemoteControlTest {
    public static void main(String [] args){
        RemoteControlTest remoteControlTest = new RemoteControlTest();
        remoteControlTest.test();
    }

    /**
     * Light is on
     * Light is off
     * TV is on
     * TV is on
     */
    private void test(){
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOnCommand tvOffCommand = new TVOnCommand(tv);

        remoteControl.setCommand(0,lightOn,lightOff);
        remoteControl.setCommand(1,tvOnCommand,tvOffCommand);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);

        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(1);

        remoteControl.onButtonPressed(5);
        remoteControl.offButtonPressed(5);
    }
}
