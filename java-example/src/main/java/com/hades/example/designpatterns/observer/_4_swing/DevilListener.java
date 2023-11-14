package com.hades.example.designpatterns.observer._4_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 观察者：恶魔
 */
public class DevilListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Come on, do it!");
    }
}
