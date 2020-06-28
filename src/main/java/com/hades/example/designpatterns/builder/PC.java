package com.hades.example.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class PC {
    private String name;
    List<String> pcComponents = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setComponents(List<String> pcComponents) {
        this.pcComponents = pcComponents;
    }

    public void create() {
        for (String item : pcComponents) {
            System.out.println("add " + item);
        }
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", pcComponents=" + pcComponents.toString() +
                '}';
    }
}
