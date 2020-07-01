package com.hades.example.designpatterns.prototype.deep_clone._2;

import java.io.Serializable;

public class ParamBean implements Cloneable, Serializable {
    String color = "Red";

    public ParamBean(String color) {
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
