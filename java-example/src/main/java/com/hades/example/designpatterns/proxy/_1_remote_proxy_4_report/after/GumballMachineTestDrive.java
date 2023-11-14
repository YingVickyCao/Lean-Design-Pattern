package com.hades.example.designpatterns.proxy._1_remote_proxy_4_report.after;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

// server
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        try {
            String name = GumballMachineRemote.class.getSimpleName();
            GumballMachineRemote engine = new GumballMachine("Location_1", 5);
            GumballMachineRemote stub = (GumballMachineRemote) UnicastRemoteObject.exportObject(engine, 0);
            Registry registry = LocateRegistry.createRegistry(1099);
            System.out.println("Server registry");
            registry.rebind(name, stub);
            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
    }
}