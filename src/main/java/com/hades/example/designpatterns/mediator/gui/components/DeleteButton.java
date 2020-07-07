package com.hades.example.designpatterns.mediator.gui.components;

import com.hades.example.designpatterns.mediator.gui.IMediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends JButton implements Component {
    private IMediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
