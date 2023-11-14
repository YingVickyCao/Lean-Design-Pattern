package com.hades.example.designpatterns.mediator.gui.components;

import com.hades.example.designpatterns.mediator.gui.IMediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveButton extends JButton implements Component {
    private IMediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
