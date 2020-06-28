package com.hades.example.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class PCBuilder {
    String name;

    List<String> components = new ArrayList<>();

    public PCBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public abstract PCBuilder addMaster();

    public abstract PCBuilder addScreen();

    public abstract PCBuilder addMouse();

    public abstract PCBuilder addKeyboard();

    public  PC build(){
        PC pc = new PC();
        pc.setName(this.name);
        pc.setComponents(components);
        return pc;
    }
}
