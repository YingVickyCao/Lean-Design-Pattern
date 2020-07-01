package com.hades.example.designpatterns.prototype.shadow_clone;

public class Test {
    public static void main(String[] args) {
        DogMaker dogMaker = new DogMaker();
        Dog whiteDog2 = dogMaker.makeDogOperation(WhiteDog.class.getSimpleName(), "White dog");
        Dog blackDog2 = dogMaker.makeDogOperation(BlackDog.class.getSimpleName(), "Black dog");

        System.out.println(whiteDog2.hashCode());   // 1651191114
        System.out.println(blackDog2.hashCode());   // 1586600255

        System.out.println(whiteDog2);  // Dog{name='White dog', age=2, food='null', ParamBean@'1586600255'}
        whiteDog2.jump();               // White dog can jump
        System.out.println();

        System.out.println(blackDog2);  // Dog{name='Black dog', age=0, food='Canned beef', ParamBean@'474675244'}
        blackDog2.jump();
    }
}