package com.hades.example.designpatterns.builder;

public class HPPCBuilder extends PCBuilder{
    @Override
    public PCBuilder addMaster() {
        components.add("Master with i7");
        return this;
    }

    @Override
    public PCBuilder addScreen() {
        components.add("2048 Screen");
        return this;
    }

    @Override
    public PCBuilder addMouse() {
        components.add("Luo Ji Mouse");
        return this;
    }

    @Override
    public PCBuilder addKeyboard() {
        components.add("HP Keyboard");
        return this;
    }
}
