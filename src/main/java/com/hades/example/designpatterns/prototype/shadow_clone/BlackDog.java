package com.hades.example.designpatterns.prototype.shadow_clone;

public class BlackDog extends Dog {
    public BlackDog(String name, String food) {
        super(name);
        this.food = food;
    }

    // Each concrete Dog could determine how best to clone itself

    /**
     * Shadow Clone
     */
    @Override
    public Dog copy() throws CloneNotSupportedException {
        return (Dog) this.clone();
    }
}
