package com.hades.example.designpatterns.observer._4_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 观察者：天使
 */
public class AngeListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don't do it, you might regret it");
    }
}
