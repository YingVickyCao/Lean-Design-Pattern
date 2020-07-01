package com.hades.example.designpatterns.prototype.shadow_clone;

public class Test {
    public static void main(String[] args) {
        Dog whiteDog = new WhiteDog("Teddy", 2); // prototype for all white dogs
        Dog blackDog = new BlackDog("Ben", "Canned beef"); // prototype for all Drakons
        System.out.println(whiteDog.hashCode());    // 1973538135
        System.out.println(blackDog.hashCode());    // 1365202186
        System.out.println(whiteDog.toString());    // Dog{name='Teddy', age=2, food='null', ParamBean@'1586600255'}
        System.out.println(blackDog.toString());    // Dog{name='Ben', age=0, food='Canned beef', ParamBean@'474675244'}
        System.out.println();

        Dog whiteDog2 = makeDogOperation(whiteDog, "White dog");
        Dog blackDog2 = makeDogOperation(blackDog, "Black dog");

        System.out.println(whiteDog2.hashCode());   // 1651191114
        System.out.println(blackDog2.hashCode());   // 1586600255

        System.out.println(whiteDog2);  // Dog{name='White dog', age=2, food='null', ParamBean@'1586600255'}
        whiteDog2.jump();               // White dog can jump
        System.out.println();

        System.out.println(blackDog2);  // Dog{name='Black dog', age=0, food='Canned beef', ParamBean@'474675244'}
        blackDog2.jump();
    }

    public static Dog makeDogOperation(Dog dogToCopy, String name) {
        Dog newDog = null;
        try {
            newDog = dogToCopy.copy();
            newDog.setName(name);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return newDog;
    }
}
