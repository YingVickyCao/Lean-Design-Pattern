package com.hades.example.designpatterns.prototype.deepclone.shadow_clone;

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
    public Dog copy() throws CloneNotSupportedException {
        return (Dog) this.clone();
    }
}
