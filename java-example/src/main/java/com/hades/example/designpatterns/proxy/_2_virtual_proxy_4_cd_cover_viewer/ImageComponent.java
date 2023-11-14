package com.hades.example.designpatterns.proxy._2_virtual_proxy_4_cd_cover_viewer;

import javax.swing.*;
import java.awt.*;

public class ImageComponent extends JComponent {
    private static final long serialVersionUID = -412372459921362705L;

    private Icon mIcon;

    public ImageComponent(Icon icon) {
        mIcon = icon;
    }

    public void setIcon(Icon icon) {
        mIcon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = mIcon.getIconWidth();
        int height = mIcon.getIconHeight();
        int x = (800 - width) / 2;
        int y = (600 - height) / 2;
        mIcon.paintIcon(this, g, x, y);
    }
}
