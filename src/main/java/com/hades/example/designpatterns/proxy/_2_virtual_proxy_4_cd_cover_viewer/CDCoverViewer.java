package com.hades.example.designpatterns.proxy._2_virtual_proxy_4_cd_cover_viewer;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class CDCoverViewer {
    private ImageComponent mImageComponent;
    private JFrame mFrame = new JFrame("CD Cover Viewer");
    private JMenuBar mMenuBar;
    private JMenu mMenu;
    private Map<String, String> mCdNameUrlMaps = new HashMap<>();

    public CDCoverViewer() throws Exception {
        setCds();

        mMenu = new JMenu("Favorite CDs");

        mMenuBar = new JMenuBar();
        mMenuBar.add(mMenu);

        for (Map.Entry<String, String> entry : mCdNameUrlMaps.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            JMenuItem menuItem = new JMenuItem(entry.getKey());
            mMenu.add(menuItem);
            menuItem.addActionListener(event -> {
                mImageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                mFrame.repaint();
            });
        }

        Icon icon = new ImageIcon();
        mImageComponent = new ImageComponent(icon);

        mFrame.setJMenuBar(mMenuBar);
        mFrame.getContentPane().add(mImageComponent);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setSize(800, 600);
        mFrame.setVisible(true);
    }

    private void setCds() {
        mCdNameUrlMaps.put("Buddha Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        mCdNameUrlMaps.put("Ima", "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        mCdNameUrlMaps.put("Karma", "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        mCdNameUrlMaps.put("MCMXC A.D.", "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        mCdNameUrlMaps.put("Northern Exposure", "http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        mCdNameUrlMaps.put("Selected Ambient Works, Vol. 2", "http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
    }

    private URL getCDUrl(String name) {
        try {
            return new URL(mCdNameUrlMaps.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
