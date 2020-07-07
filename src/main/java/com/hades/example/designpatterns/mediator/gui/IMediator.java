package com.hades.example.designpatterns.mediator.gui;

import com.hades.example.designpatterns.mediator.gui.components.Component;

import javax.swing.*;

public interface IMediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
