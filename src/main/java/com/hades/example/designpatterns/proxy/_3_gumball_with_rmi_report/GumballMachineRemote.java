package com.hades.example.designpatterns.proxy._3_gumball_with_rmi_report;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
