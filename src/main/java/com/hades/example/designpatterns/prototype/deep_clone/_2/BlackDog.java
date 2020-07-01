package com.hades.example.designpatterns.prototype.deep_clone._2;

public class BlackDog extends Dog {
    public BlackDog(String name, String food) {
        super(name);
        this.food = food;
    }

    // Each concrete Dog could determine how best to clone itself
    @Override
    public Dog copy() throws CloneNotSupportedException {
        return (Dog) this.clone();
    }
}
