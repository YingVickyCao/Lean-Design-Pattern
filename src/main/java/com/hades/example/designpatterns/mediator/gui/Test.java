package com.hades.example.designpatterns.mediator.gui;

import com.hades.example.designpatterns.mediator.gui.components.*;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        IMediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel<Note>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
