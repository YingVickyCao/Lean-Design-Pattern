package com.hades.example.designpatterns.prototype.deep_clone;

public class ParamBean implements Cloneable{
    String color = "Red";

    public ParamBean(String color) {
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
