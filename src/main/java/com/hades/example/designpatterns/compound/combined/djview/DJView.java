package com.hades.example.designpatterns.compound.combined.djview;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DJView implements ActionListener, BeatObserver, BPMObserver {
    private IBeatModel model;
    private IController controller;

    BeatBar beatBar;
    JLabel bpmOutputLabelLeft;
    JLabel currentBpmOutputLabel;
    JFrame controlFrame;
    JPanel controlPanel;
    JLabel bpmLabel;
    JTextField bpmTextField;
    JButton setBPMButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

    public DJView(IBeatModel model, IController controller) {
        this.model = model;
        this.controller = controller;

        this.model.registerObserver((BPMObserver) this);
        this.model.registerObserver((BeatObserver) this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == setBPMButton) {
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        } else if (event.getSource() == increaseBPMButton) {
            controller.increaseBPM();
        } else if (event.getSource() == decreaseBPMButton) {
            controller.decreaseBPM();
        }
    }

    @Override
    public void updateBPM() {
        if (model != null) {
            int bpm = model.getBPM();
            if (bpm == 0) {
                if (currentBpmOutputLabel != null) {
                    currentBpmOutputLabel.setText("offline");
                }
            } else {
                if (currentBpmOutputLabel != null) {
                    currentBpmOutputLabel.setText(String.valueOf(model.getBPM()));
                }
            }
        }
    }

    @Override
    public void updateBeat() {
        if (beatBar != null) {
            beatBar.setValue(100);
        }
    }

    public void createView() {
        // Create all Swing components here
    }

    private void setMenus(){
        menu = new JMenu("DJ Control");

        startMenuItem = new JMenuItem("Start");
        startMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.start();
            }
        });
        menu.add(startMenuItem);

        stopMenuItem = new JMenuItem("Stop");
        stopMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.stop();
            }
        });
        menu.add(stopMenuItem);


        JMenuItem exit = new JMenuItem("Quit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        menu.add(exit);
    }
    public void createControls() {
        // Create all Swing components here
//        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100, 80));

        controlPanel = new JPanel(new GridLayout(1, 2));


        setMenus();

        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);

        bpmOutputLabelLeft = new JLabel("Current BPM:");
        currentBpmOutputLabel = new JLabel("offline");

        setBPMButton = new JButton("Set");
        setBPMButton.setSize(new Dimension(10, 40));
        increaseBPMButton = new JButton(">>");
        decreaseBPMButton = new JButton("<<");
        setBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);
        decreaseBPMButton.addActionListener(this);

        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);

        JPanel outputPanel = new JPanel(new GridLayout(1, 2));
        outputPanel.add(bpmOutputLabelLeft);
        outputPanel.add(currentBpmOutputLabel);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(decreaseBPMButton);
        buttonPanel.add(increaseBPMButton);

        JPanel insideControlPanel = new JPanel(new GridLayout(4, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(outputPanel);
        insideControlPanel.add(setBPMButton);
        insideControlPanel.add(buttonPanel);
        controlPanel.add(insideControlPanel);

        beatBar = new BeatBar();
        beatBar.setValue(0);
        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(beatBar);
        controlPanel.add(bpmPanel);

        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        currentBpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        menuBar = new JMenuBar();
        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);
        controlFrame.getRootPane().setDefaultButton(setBPMButton);
        controlFrame.getContentPane().add(controlPanel);

        controlFrame.pack();
        controlFrame.setVisible(true);
    }

    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }
}