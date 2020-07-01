package com.hades.example.designpatterns.prototype.shadow_clone;

public class DogMaker {
    DogRegistry mDogRegistry = new DogRegistry();

    public Dog makeDogOperation(String type, String name) {
        return mDogRegistry.getDog(type, name);
    }
}
