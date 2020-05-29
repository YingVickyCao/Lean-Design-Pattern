package com.hades.example.designpatterns.proxy._1_remote_proxy.after;

import java.rmi.RemoteException;

public class GumballMonitor {
    private GumballMachineRemote mGumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        mGumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("GumballMachine"
                    + " location=" + mGumballMachine.getLocation()
                    + ",gumball count=" + mGumballMachine.getCount()
                    + ",state=" + mGumballMachine.getState().getClass().getSimpleName());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
