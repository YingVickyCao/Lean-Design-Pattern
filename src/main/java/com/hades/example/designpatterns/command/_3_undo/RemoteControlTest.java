package com.hades.example.designpatterns.command._3_undo;

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
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOnCommand tvOffCommand = new TVOnCommand(tv);

        remoteControlWithUndo.setCommand(0,lightOn,lightOff);
        remoteControlWithUndo.setCommand(1,tvOnCommand,tvOffCommand);

        remoteControlWithUndo.onButtonPressed(0);
        remoteControlWithUndo.offButtonPressed(0);

        remoteControlWithUndo.onButtonPressed(1);
        remoteControlWithUndo.offButtonPressed(1);

        remoteControlWithUndo.onButtonPressed(5);
        remoteControlWithUndo.offButtonPressed(5);
    }
}
