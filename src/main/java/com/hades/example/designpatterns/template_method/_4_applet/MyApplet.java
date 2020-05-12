package com.hades.example.designpatterns.template_method._4_applet;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    private String message;

    @Override
    public void init() {
        super.init();
        message = "Init";
        System.out.println("Init");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Start");
        message = "Start";
        repaint();
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Stop");
        message = "Stop";
        repaint();
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("Destroy");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(message, 5, 15);
    }
}
