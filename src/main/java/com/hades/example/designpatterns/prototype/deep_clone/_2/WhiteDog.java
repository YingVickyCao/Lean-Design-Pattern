package com.hades.example.designpatterns.prototype.deep_clone._2;

import java.io.IOException;

public class WhiteDog extends Dog {
    public WhiteDog(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void jump() {
        System.out.println(this.name + " can jump");
    }

    // Each concrete Dog could determine how best to clone itself
    @Override
    public Dog copy() throws IOException, ClassNotFoundException {
        return this.deepClone();
    }
}