package com.hades.example.designpatterns.builder;

public class DellPCBuilder extends PCBuilder {
    @Override
    public PCBuilder addMaster() {
        components.add("Master with i9");
        return this;
    }

    @Override
    public PCBuilder addScreen() {
        components.add("1080p Screen");
        return this;
    }

    @Override
    public PCBuilder addMouse() {
        components.add("Microsoft Mouse");
        return this;
    }

    @Override
    public PCBuilder addKeyboard() {
        components.add("Cherry 青轴机械键盘");
        return this;
    }
}
