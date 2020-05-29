package com.hades.example.designpatterns.proxy._1_remote_proxy.after;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// client
public class GumballMonitorTestDrive {
    // mock one GumballMachine is running
//    public static void main(String[] args) {
//        if (System.getSecurityManager() == null) {
//            System.setSecurityManager(new SecurityManager());
//        }
//        try {
//            String name = GumballMachineRemote.class.getSimpleName();
//            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
//            GumballMachineRemote remote = (GumballMachineRemote) registry.lookup(name);
//            GumballMonitor monitor = new GumballMonitor(remote);
//            monitor.report();
//        } catch (Exception e) {
//            System.err.println("ComputePi exception:");
//            e.printStackTrace();
//        }
//    }

    // mock many GumballMachines is running
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        String[] locations = {
                "localhost", "localhost",
        };
        for (String location : locations) {
            try {
                String name = GumballMachineRemote.class.getSimpleName();
                Registry registry = LocateRegistry.getRegistry(location, 1099);
                GumballMachineRemote remote = (GumballMachineRemote) registry.lookup(name);
                GumballMonitor monitor = new GumballMonitor(remote);
                monitor.report();
            } catch (Exception e) {
                System.err.println("ComputePi exception:");
                e.printStackTrace();
            }
        }
    }
}
