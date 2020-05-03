package com.hades.example.designpatterns.command._4_undo;

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

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControlWithUndo.setCommand(0,lightOn,lightOff);
        remoteControlWithUndo.setCommand(1,tvOnCommand,tvOffCommand);
        remoteControlWithUndo.setCommand(3,ceilingFanLowCommand,ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(4,ceilingFanMediumCommand,ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(5,ceilingFanHighCommand,ceilingFanOffCommand);

        remoteControlWithUndo.onButtonPressed(0);
        remoteControlWithUndo.offButtonPressed(0);

        remoteControlWithUndo.onButtonPressed(1);
        remoteControlWithUndo.offButtonPressed(1);

        remoteControlWithUndo.onButtonPressed( 3);
        remoteControlWithUndo.onButtonPressed( 4);
        remoteControlWithUndo.undoButtonPressed( );
        remoteControlWithUndo.offButtonPressed( 5);

        remoteControlWithUndo.onButtonPressed(6);
        remoteControlWithUndo.offButtonPressed(6);
    }
}
