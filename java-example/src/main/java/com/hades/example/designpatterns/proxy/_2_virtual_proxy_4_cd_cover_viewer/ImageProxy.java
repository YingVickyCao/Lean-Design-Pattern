package com.hades.example.designpatterns.proxy._2_virtual_proxy_4_cd_cover_viewer;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    private ImageIcon mImageIcon;
    private URL mImageURL;
    private Thread mRetrieveThread;
    boolean mIsRetrieving = false;

    public ImageProxy(URL URL) {
        mImageURL = URL;
    }

    @Override
    public int getIconWidth() {
        return null != mImageIcon ? mImageIcon.getIconWidth() : 800;
    }

    @Override
    public int getIconHeight() {
        return null != mImageIcon ? mImageIcon.getIconHeight() : 600;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (null != mImageIcon) {
            mImageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD Cover. Please wait...", x + 300, y + 300);
            if (!mIsRetrieving) {
                mIsRetrieving = true;
                mRetrieveThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            mImageIcon = new ImageIcon(mImageURL, "CD Cover");
                            c.repaint();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
                mRetrieveThread.start();
            }
        }
    }
}
