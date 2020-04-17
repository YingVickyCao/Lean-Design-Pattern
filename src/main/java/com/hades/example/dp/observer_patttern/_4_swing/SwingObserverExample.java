package com.hades.example.dp.observer_patttern._4_swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    private JFrame mJFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        mJFrame = new JFrame();

        JButton button = new JButton("Should I do it ?");
        button.addActionListener(new AngeListener());
        button.addActionListener(new DevilListener());

        mJFrame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        mJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mJFrame.getContentPane().add(BorderLayout.CENTER, button);
        mJFrame.setSize(300,300);
        mJFrame.setVisible(true);
    }
}
