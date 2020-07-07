package com.hades.example.designpatterns.mediator.gui.components;

import com.hades.example.designpatterns.mediator.gui.IMediator;

public interface Component {
    void setMediator(IMediator mediator);
    String getName();
}
